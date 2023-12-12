package creationalpatterns.abstractfactory.theory;

/**
 * Класс клиента Client использует класс фабрики для создания объектов.
 * При этом он использует исключительно абстрактный класс фабрики AbstractFactory
 * и абстрактные классы продуктов AbstractProductA и AbstractProductB и никак не зависит от их конкретных реализаций
 */
public class Client {
    private AbstractProductA abstractProductA;
    private AbstractProductB abstractProductB;

    public Client(AbstractFactory factory) {
        this.abstractProductA = factory.createProductA();
        this.abstractProductB = factory.createProductB();
    }

    public void run() {
        // some code
    }
}
