package testing.kodilla;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {

        ArrayList<Integer> theList = new ArrayList<>();
        double average;
        SchoolScore generateScore = new SchoolScore();

        generateScore.generateList(theList);

        for(Integer print: theList) {
            System.out.println(print);
        }

        average = generateScore.getUserAverage(theList);
        System.out.println("Average :" + average);
    }
}
