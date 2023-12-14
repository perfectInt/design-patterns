package structuralpatterns.facade.theory;

/**
 * Facade - непосредственно фасад, который предоставляет интерфейс клиенту для работы с компонентами
 */
public class Facade {
    SubsystemA subsystemA;
    SubsystemB subsystemB;
    SubsystemC subsystemC;

    public Facade(SubsystemA subsystemA, SubsystemB subsystemB, SubsystemC subsystemC) {
        this.subsystemA = subsystemA;
        this.subsystemB = subsystemB;
        this.subsystemC = subsystemC;
    }

    public void operation1() {
        subsystemA.a1();
        subsystemB.b1();
        subsystemC.c1();
    }

    public void operation2() {
        subsystemB.b1();
        subsystemC.c1();
    }
}
