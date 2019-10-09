package main.java.humanDontBeAnnoyed.game;

import jdk.internal.util.xml.impl.Pair;
import main.java.humanDontBeAnnoyed.figure.Figure;
import main.java.humanDontBeAnnoyed.figure.FigureService;
import main.java.humanDontBeAnnoyed.player.Player;
import main.java.humanDontBeAnnoyed.playground.Playground;

import java.awt.*;
import java.util.*;
import java.util.List;

public class GameService {

    public Game createGame(Scanner scanner){
        FigureService figureService = new FigureService();
        List<Player> players = new ArrayList<>();
        List<String> figureRepresentations = new LinkedList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "h", "l", "m", "n", "o", "p"));
        List<Point> startCoordinates = new LinkedList<>(Arrays.asList(
                new Point(4,0),
                new Point(0,6),
                new Point(6,10),
                new Point(10,4)
        ));
        while(players.size() < 4){
            List<Figure> figures = new ArrayList<>();
            System.out.println("Spieler " + (players.size() + 1) + ": Bitte Namen eingeben");
            String name = scanner.nextLine();
            while (figures.size() < 4){
                Figure figure = new Figure(figureRepresentations.get(0));
                figureRepresentations.remove(0);
                figures.add(figure);
            }
            players.add(new Player(name, figures, startCoordinates.get(0)));
        }
        for(int i = 0; i < players.size(); i++){
            Player player = players.get(i);
            System.out.println("Spieler " + (i + 1) + ": " + player.getName());
        }

        Playground playground = new Playground();
        Game game = new Game(players, playground);
        game.getPlayers().forEach(player -> {
            player.setFigurePath(figureService.createFigurePath(player.getStartCell(), game));
            player.getFigures().forEach(figure -> {
                figure.setPath(player.getFigurePath());
                figure.setOwnedBy(player);
            });
        });
        game.setGameStatus(GameStatusType.STARTED);
        Player firstPlayer = game.getPlayers().get(0);
        game.setTurn(firstPlayer);
        return game;
    }

    public int rollDice(){
        return (int)(6.0 * Math.random());
    }
}
