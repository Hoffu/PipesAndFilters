package model;

import java.util.ArrayList;

public class OutputStreamImpl implements OutputStream {
    private Item item;

    @Override
    public void flush(Object object) {
        item.addResults(object);
        System.out.println(object);
    }

    @Override
    public void write(String str) {
        item = new Item(str);
        System.out.println(str);
    }

    @Override
    public String readInput() {
        return item.getInputText();
    }

    @Override
    public ArrayList<Object> readResults() {
        return item.getResults();
    }
}
