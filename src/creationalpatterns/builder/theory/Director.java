package creationalpatterns.builder.theory;

/**
 * Director: распорядитель - создает объект, используя объекты Builder
 */
public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
