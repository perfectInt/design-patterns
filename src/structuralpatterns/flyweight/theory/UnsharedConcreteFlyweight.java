package structuralpatterns.flyweight.theory;

/**
 * UnsharedConcreteFlyweight: еще одна конкретная реализация интерфейса, определенного в типе Flyweight,
 * только теперь объекты этого класса являются неразделяемыми
 */
public class UnsharedConcreteFlyweight extends Flyweight {
    int allState;

    @Override
    public void operation(int externalState) {
        allState = externalState;
    }
}
