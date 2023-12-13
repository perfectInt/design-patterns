package behavioralpatterns.chainofresponsibility.example;

public class PaypalPaymentHandler extends PaymentHandler {
    @Override
    public void handle(Receiver receiver) {
        if (receiver.payPalTransfer)
            System.out.println("Выполняем банковский перевод через PayPal");
        else if (successor != null)
            successor.handle(receiver);
    }
}
