package structuralpatterns.flyweight.theory;

/**
 * Client: использует объекты приспособленцев.
 * Может хранить внешнее состояние и передавать его в качестве аргументов в методы приспособленцев
 */
public class Client {
    public void run() {
        int externalState = 22;
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight fx = factory.getFlyweight("X");
        fx.operation(--externalState);

        // и так далее

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--externalState);
    }
}
