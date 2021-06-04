package model;

public interface IPipeline {
    void addLink(IComponent link);
    boolean process(OutputStream outputStream);
}
