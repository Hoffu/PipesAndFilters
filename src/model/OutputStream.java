package model;

import java.util.ArrayList;

public interface OutputStream {
    void flush(Object object);
    void write(String str);
    String readInput();
    ArrayList readResults();
}
