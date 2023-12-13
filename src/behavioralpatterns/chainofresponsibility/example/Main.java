package behavioralpatterns.chainofresponsibility.example;

import behavioralpatterns.chainofresponsibility.theory.Handler;

/**
 * Цепочка Обязанностей (Chain of responsibility) - поведенческий шаблон проектирования,
 * который позволяет избежать жесткой привязки отправителя запроса к получателю.
 * Все возможные обработчики запроса образуют цепочку, а сам запрос перемещается по этой цепочке.
 * Каждый объект в этой цепочке при получении запроса выбирает, либо закончить обработку запроса,
 * либо передать запрос на обработку следующему по цепочке объекту.
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver(false, true, true);

        PaymentHandler bankPaymentHandler = new BankPaymentHandler();
        PaymentHandler moneyPaymentHandler = new MoneyPaymentHandler();
        PaymentHandler paypalPaymentHandler = new PaypalPaymentHandler();
        bankPaymentHandler.successor = paypalPaymentHandler;
        paypalPaymentHandler.successor = moneyPaymentHandler;
        bankPaymentHandler.handle(receiver);
    }
}
