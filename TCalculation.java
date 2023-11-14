package NamelessPaper;

import java.util.ArrayList;

public class TCalculation<T extends Number> {

    ArrayList<T> numList = new ArrayList<>();

    public void append(T value) {
        numList.add(value);
    }

    public double average() {
        double tot = 0;

        for (T val : numList) {
            tot = tot + val.doubleValue();
        }

        double avg = tot / numList.size();
        return avg;
    }

    public static void main(String[] args) {
        TCalculation<Integer> integerCalculation = new TCalculation<>();
        integerCalculation.append(5);
        integerCalculation.append(10);
        integerCalculation.append(15);

        double integerAvg = integerCalculation.average();
        System.out.println("Average of integers: " + integerAvg);

        TCalculation<Double> doubleCalculation = new TCalculation<>();
        doubleCalculation.append(2.5);
        doubleCalculation.append(5.5);
        doubleCalculation.append(8.5);

        double doubleAvg = doubleCalculation.average();
        System.out.println("Average of doubles: " + doubleAvg);
    }
}
