package behavioralpatterns.mediator.theory;

/**
 * Mediator: представляет интерфейс для взаимодействия с объектами Colleague
 */
public abstract class Mediator {
    public abstract void send(String msg, Colleague colleague);
}
