package model;

public abstract class InputSource extends StreamingControlBase{
    boolean isOutputSink = false;
    public abstract boolean process(OutputStream outputStream);
    public boolean process(InputStream inputStream, OutputStream outputStream) {
        for (String number : inputStream.read().split("\\W")) {
            outputStream.write(number);
        }
        return process(outputStream);
    }
}
