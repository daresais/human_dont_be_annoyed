package main.java.humanDontBeAnnoyed.figure;

import main.java.humanDontBeAnnoyed.player.Player;

import java.awt.*;
import java.util.List;

public class Figure {
    private Player ownedBy;
    private String representation;
    private Boolean insideField;
    private List<Point> path;

    public Figure(String representation) {
        this.representation = representation;
        this.insideField = false;
    }

    public Player getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(Player ownedBy) {
        this.ownedBy = ownedBy;
    }

    public String getRepresentation() {
        return representation;
    }

    public void setRepresentation(String representation) {
        this.representation = representation;
    }

    public Boolean getInsideField() {
        return insideField;
    }

    public void setInsideField(Boolean insideField) {
        this.insideField = insideField;
    }

    public void kickOut(){
        this.insideField = false;
    }

    public List<Point> getPath() {
        return path;
    }

    public void setPath(List<Point> path) {
        this.path = path;
    }
}
