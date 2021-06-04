package model;

public interface IStreamingControl {
    InputStream input = null;
    OutputStream output = null;

    InputStream factoryInputStream();
    OutputStream factoryOutputStream();


}
