package model;

public interface IComponentStreaming extends IComponent {
    boolean process(InputStream inputStream, OutputStream outputStream);
}
