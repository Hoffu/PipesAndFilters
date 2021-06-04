package model;

import java.util.ArrayList;

public class Item {
    private final String inputText;
    private ArrayList<Object> results;

    public Item(String inputText) {
        this.inputText = inputText;
        results = new ArrayList<>();
    }

    public String getInputText() {
        return inputText;
    }

    public ArrayList<Object> getResults() {
        return results;
    }

    public void addResults(Object object) {
        results.add(object);
    }
}
