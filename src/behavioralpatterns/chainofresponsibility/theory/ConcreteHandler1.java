package behavioralpatterns.chainofresponsibility.theory;

/**
 * ConcreteHandler1 и ConcreteHandler2: конкретные обработчики, которые реализуют функционал для обработки запроса.
 * При невозможности обработки и наличия ссылки на следующий обработчик, передают запрос этому обработчику
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int condition) {
        if (condition == 1) {
            return;
        } else if (successor != null) {
            successor.handleRequest(condition);
        }
    }
}
