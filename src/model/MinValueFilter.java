package model;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class MinValueFilter extends InputSource {
    private int[] numbers;

    @Override
    public boolean process(OutputStream outputStream) {
        numbers = new ConvertStringToIntArray(outputStream.readInput()).convert();
        try {
            IntSummaryStatistics stat = Arrays.stream(numbers).summaryStatistics();
            int min = stat.getMin();
            outputStream.flush(min);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
