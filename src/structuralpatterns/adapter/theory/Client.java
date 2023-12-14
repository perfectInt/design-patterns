package structuralpatterns.adapter.theory;

/**
 * Client: использует объекты Target для реализации своих задач
 */
public class Client {

    public void request(Target target) {
        target.request();
    }
}
