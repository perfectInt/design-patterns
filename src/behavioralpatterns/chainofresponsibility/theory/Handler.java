package behavioralpatterns.chainofresponsibility.theory;

/**
 * Handler: определяет интерфейс для обработки запроса. Также может определять ссылку на следующий обработчик запроса
 */
public abstract class Handler {
    public Handler successor;
    public abstract void handleRequest(int condition);
}
