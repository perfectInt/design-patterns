package behavioralpatterns.chainofresponsibility.example;

public class MoneyPaymentHandler extends PaymentHandler {
    @Override
    public void handle(Receiver receiver) {
        if (receiver.moneyTransfer)
            System.out.println("Выполняем перевод через системы денежных платежей.");
        else if (successor != null)
            successor.handle(receiver);
    }
}
