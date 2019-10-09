package main.java.humanDontBeAnnoyed.figure;

import main.java.humanDontBeAnnoyed.game.Game;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FigureService {

    public List<Point> createFigurePath(Point start, Game game) {
//        int step = 0;
//        Point currentCoordinates = start;
//        ArrayList<ArrayList<String>> field = game.getPlayground().getField();
//        List<Point> path = new LinkedList<>();
//        Point nextStep = new Point();
//        while (step < 43) {
//            int x = currentCoordinates.x;
//            int y = currentCoordinates.y;
//
//            if (field.size() > y + 1 && field.get(y + 1).get(x).equals("■") && !path.contains(new Point(x, y + 1))) {
//                nextStep = new Point(x, y + 1);
//            } else if (x - 1 > 0 && field.get(y).get(x - 1).equals("■") && !path.contains(new Point(x - 1, y))) {
//                nextStep = new Point(x - 1, y);
//            } else if (field.get(y).size() > x + 1 && field.get(y).get(x + 1).equals("■") && !path.contains(new Point(x + 1, y))) {
//                nextStep = new Point(x + 1, y);
//            } else {
//                nextStep = new Point(x, y - 1);
//            }
//            currentCoordinates = nextStep;
//            path.add(nextStep);
//            step++;
//        }
//        return path;
        return new ArrayList<>();
    }
}
