package main.java.humanDontBeAnnoyed.playground;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlaygroundService {

    ArrayList<ArrayList<String>> importPlayground() {
        FileReader fileReader;
        try {
            String filename = "src/main/resources/playground.txt";
            fileReader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            System.out.println("Spielfeld nicht gefunden :(");
            return new ArrayList<>();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList<ArrayList<String>> lines = new ArrayList<>();
        String currentLine;
        try {
            while ((currentLine = bufferedReader.readLine()) != null) {
                ArrayList<String> line = new ArrayList<>();
                for(char c : currentLine.toCharArray()){
                    line.add("" + c);
                }
                lines.add(line);
            }
            bufferedReader.close();
            return lines;
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    public void printField(ArrayList<ArrayList<String>> field){
        for(ArrayList<String> line : field){
            StringBuilder l = new StringBuilder();
            for(String c : line){
                l.append(c);
            }
            System.out.println(l);
        }
    }
}
