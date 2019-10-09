package main.java.humanDontBeAnnoyed;

import main.java.humanDontBeAnnoyed.game.Game;
import main.java.humanDontBeAnnoyed.game.GameService;
import main.java.humanDontBeAnnoyed.player.Player;
import main.java.humanDontBeAnnoyed.playground.Playground;
import main.java.humanDontBeAnnoyed.playground.PlaygroundService;

import java.util.*;

public class main {

    private static Playground playground;
    private static Scanner scanner;
    private static Game game;
    private static GameService gameService;
    private static PlaygroundService playgroundService;

    public static void main(String[] args) {
        gameService = new GameService();
        playgroundService = new PlaygroundService();
        scanner = new Scanner(System.in);
        game = gameService.createGame(scanner);
        gameLoop();
    }

    private static void gameLoop(){
        while (!game.getWinnerDetermined()){
            playgroundService.printField(game.getPlayground().getField());
            Player player = game.getTurn();
            System.out.println("Spieler " + player.getName() + " am Zug. ENTER drücken zum würfeln");
            String input = scanner.nextLine();
            if(input.equals("")){
                int diceRollingResult = gameService.rollDice();
                StringBuilder builder = new StringBuilder();
                builder.append(player.getName() + " hat eine " + diceRollingResult + " gewürfelt! Welche figur soll bewegt werden? \n");
                player.getFigures().forEach(figure -> builder.append(figure.getRepresentation() + "\n"));
                builder.append("?");
                System.out.println(builder);
                String selectedFigure = scanner.nextLine();
                System.out.println("OK " + selectedFigure);
            }
        }
    }
}
