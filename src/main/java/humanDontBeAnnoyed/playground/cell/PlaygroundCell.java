package main.java.humanDontBeAnnoyed.playground.cell;

import jdk.internal.util.xml.impl.Pair;
import main.java.humanDontBeAnnoyed.player.Player;

import java.awt.*;

public class PlaygroundCell {
    private PlaygroundCellType cellType;
    private Point nextCell;
    private Player currentPlayer;
    private Point coordinates;

    public PlaygroundCell(PlaygroundCellType cellType, Point nextCell, Point coordinates) {
        this.cellType = cellType;
        this.nextCell = nextCell;
        this.currentPlayer = null;
        this.coordinates = coordinates;
    }

    public PlaygroundCellType getCellType() {
        return cellType;
    }

    public void setCellType(PlaygroundCellType cellType) {
        this.cellType = cellType;
    }

    public Point getNextCell() {
        return nextCell;
    }

    public void setNextCell(Point nextCell) {
        this.nextCell = nextCell;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }
}
