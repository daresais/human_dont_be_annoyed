package main.java.humanDontBeAnnoyed.player;

import main.java.humanDontBeAnnoyed.figure.Figure;

import java.awt.*;
import java.util.List;

public class Player {

    private String name;
    private List<Figure> figures;
    private Point startCell;
    private List<Point> figurePath;

    public Player(String name, List<Figure> figures, Point startCoordinates) {
        this.name = name;
        this.figures = figures;
        this.startCell = startCoordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }

    public Point getStartCell() {
        return startCell;
    }

    public void setStartCell(Point startCell) {
        this.startCell = startCell;
    }

    public List<Point> getFigurePath() {
        return figurePath;
    }

    public void setFigurePath(List<Point> figurePath) {
        this.figurePath = figurePath;
    }
}
