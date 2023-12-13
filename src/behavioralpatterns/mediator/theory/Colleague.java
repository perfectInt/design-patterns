package behavioralpatterns.mediator.theory;

/**
 * Colleague: представляет интерфейс для взаимодействия с объектом Mediator
 */
public class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
