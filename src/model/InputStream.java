package model;

public interface InputStream {
    boolean available();
    String read();
    void reset();
    void reload();
}
