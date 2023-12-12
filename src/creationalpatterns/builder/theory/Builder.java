package creationalpatterns.builder.theory;

/**
 * Builder: определяет интерфейс для создания различных частей объекта Product
 */
public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    public abstract Product getResult();
}
