package se.fredsberg.euler.series;

public class MaxValueFoundInSequence implements Series<Integer> {

    private int max = Integer.MIN_VALUE; 
    
    @Override
    public void process(Integer x) {
        max = Math.max(max, x);
    }

    @Override
    public Integer getResult() {
        return max;
    }

}
