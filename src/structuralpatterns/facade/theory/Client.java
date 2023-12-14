package structuralpatterns.facade.theory;

/**
 * Client взаимодействует с компонентами подсистемы
 */
public class Client {
    public void run() {
        Facade facade = new Facade(new SubsystemA(), new SubsystemB(), new SubsystemC());
        facade.operation1();
        facade.operation2();
    }
}
