package model;

public class SummarizeNumbersFilter extends InputSource {
    private int[] numbers;

    @Override
    public boolean process(OutputStream outputStream) {
        numbers = new ConvertStringToIntArray(outputStream.readInput()).convert();
        try {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            outputStream.flush(sum);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
