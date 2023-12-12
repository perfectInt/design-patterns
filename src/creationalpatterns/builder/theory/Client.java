package creationalpatterns.builder.theory;

public class Client {
    void init() {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.getResult();
    }
}
