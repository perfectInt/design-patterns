package creationalpatterns.factorymethod.theory;

/**
 * Конкретные классы ConcreteCreatorA и ConcreteCreatorB - наследники класса Creator,
 * определяющие свою реализацию метода FactoryMethod().
 * Причем метод FactoryMethod() каждого отдельного класса-создателя возвращает определенный конкретный тип продукта.
 * Для каждого конкретного класса продукта определяется свой конкретный класс создателя.
 */
public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
