package model;

public class StreamingControlBase implements IComponentStreaming {
    @Override
    public boolean process(OutputStream outputStream) {
        return false;
    }

    @Override
    public boolean process(InputStream inputStream, OutputStream outputStream) {
        return false;
    }
}
