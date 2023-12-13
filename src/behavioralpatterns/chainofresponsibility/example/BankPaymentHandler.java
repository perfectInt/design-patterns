package behavioralpatterns.chainofresponsibility.example;

public class BankPaymentHandler extends PaymentHandler {
    @Override
    public void handle(Receiver receiver) {
        if (receiver.bankTransfer)
            System.out.println("Выполняем банковский перевод");
        else if (successor != null)
            successor.handle(receiver);
    }
}
