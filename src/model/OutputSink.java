package model;

public abstract class OutputSink extends StreamingControlBase{
    boolean isOutputSink = true;
    public abstract boolean process(InputStream inputStream);
    public boolean process(InputStream inputStream, OutputStream outputStream) {
        return process(inputStream);
    }
}
