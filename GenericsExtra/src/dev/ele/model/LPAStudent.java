package dev.ele.model;

public class LPAStudent extends Student{
    private double percentageComplete;

    public LPAStudent() {
        percentageComplete = random.nextDouble(0,100.001);
    }

    public String toString() {
        return String.format("%s %8.1f%%",super.toString(),percentageComplete);
    }

    public double getPercentageComplete() {
        return percentageComplete;
    }
}
