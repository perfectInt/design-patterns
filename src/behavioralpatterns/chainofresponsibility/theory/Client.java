package behavioralpatterns.chainofresponsibility.theory;

/**
 * Client: отправляет запрос объекту Handler
 */
public class Client {
    public void run() {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        h1.successor = h2;
        h1.handleRequest(2);
    }
}
