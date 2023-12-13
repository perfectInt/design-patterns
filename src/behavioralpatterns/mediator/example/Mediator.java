package behavioralpatterns.mediator.example;

public abstract class Mediator {
    public abstract void send(String msg, Colleague colleague);
}
