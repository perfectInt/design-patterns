package creationalpatterns.builder.theory;

/**
 * ConcreteBuilder: конкретная реализация Buildera. Создает объект Product и определяет интерфейс для доступа к нему
 */
public class ConcreteBuilder extends Builder {
    Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("Part A");
    }

    @Override
    public void buildPartB() {
        product.add("Part B");
    }

    @Override
    public void buildPartC() {
        product.add("Part C");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
