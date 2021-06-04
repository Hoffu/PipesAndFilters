package model;

public class ConvertStringToIntArray {
    private final String input;

    public ConvertStringToIntArray(String input) {
        this.input = input;
    }

    public int[] convert() {
        String[] numsInString = input.split(", ");
        int[] numbers = new int[numsInString.length];
        for (int i = 0; i < numsInString.length; i++) {
            numbers[i] = Integer.parseInt(numsInString[i]);
        }
        return numbers;
    }
}
