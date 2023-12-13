package behavioralpatterns.chainofresponsibility.example;

public abstract class PaymentHandler {
    public PaymentHandler successor;
    public abstract void handle(Receiver receiver);
}
