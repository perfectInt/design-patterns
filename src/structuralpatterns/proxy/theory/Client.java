package structuralpatterns.proxy.theory;

/**
 * Client: использует объект Proxy для доступа к объекту RealSubject
 */
public class Client {
    public void run() {
        Subject subject = new Proxy();
        subject.request();
    }
}
