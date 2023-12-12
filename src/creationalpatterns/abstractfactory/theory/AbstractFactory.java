package creationalpatterns.abstractfactory.theory;

/**
 * Абстрактный класс фабрики AbstractFactory определяет методы для создания объектов.
 * Причем методы возвращают абстрактные продукты, а не их конкретные реализации.
 */
public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
