package testing.kodilla;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SchoolScore {

    private double average;
    private double totalAssSumm;
    Random random = new Random();

    public double getUserAverage(ArrayList<Integer> score) {

        Collections.sort(score);
        score.remove(0);
        score.remove(score.size() - 1);

        for (Integer assSumm : score) {
            totalAssSumm += assSumm;
            average = totalAssSumm / score.size();
        }
        return average;
    }

    public ArrayList<Integer> generateList(ArrayList<Integer> generatedList) {

        for (int i = 0; i < 20; i++) {
            generatedList.add(random.nextInt(6) +1);
        }
        return generatedList;
    }


    public double getTotalAssSumm() {
        return totalAssSumm;
    }

}
