package main.java.humanDontBeAnnoyed.playground;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Playground {

    private ArrayList<ArrayList<String>> field;
    private PlaygroundService playgroundService;

    public Playground() {
        playgroundService = new PlaygroundService();
        field = playgroundService.importPlayground();
    }

    public ArrayList<ArrayList<String>> getField() {
        return field;
    }
}
