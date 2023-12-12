package creationalpatterns.factorymethod.theory;

/**
 * Абстрактный класс Creator определяет абстрактный фабричный метод FactoryMethod(), который возвращает объект Product.
 */
public abstract class Creator {
    public abstract Product factoryMethod();
}
