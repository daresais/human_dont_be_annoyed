package main.java.humanDontBeAnnoyed.game;

import main.java.humanDontBeAnnoyed.figure.FigureService;
import main.java.humanDontBeAnnoyed.player.Player;
import main.java.humanDontBeAnnoyed.playground.Playground;

import java.util.List;

public class Game {

    private Boolean winnerDetermined;
    private List<Player> players;
    private Enum<GameStatusType> gameStatus;
    private Player turn;
    private Playground playground;

    public Game(List<Player> players, Playground playground) {
        this.players = players;
        this.gameStatus = GameStatusType.INIT;
        this.winnerDetermined = false;
        this.playground = playground;
    }

    public Boolean getWinnerDetermined() {
        return winnerDetermined;
    }

    public void setWinnerDetermined(Boolean winnerDetermined) {
        this.winnerDetermined = winnerDetermined;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Enum<GameStatusType> getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(Enum<GameStatusType> gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Player getTurn() {
        return turn;
    }

    public void setTurn(Player turn) {
        this.turn = turn;
    }

    public Playground getPlayground() {
        return playground;
    }

    public void setPlayground(Playground playground) {
        this.playground = playground;
    }
}
