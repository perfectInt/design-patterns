package behavioralpatterns.memento.theory;

/**
 * Memento: хранитель, который сохраняет состояние объекта Originator
 * и предоставляет полный доступ только этому объекту Originator
 */
public class Memento {
    public String state;

    public Memento(String state) {
        this.state = state;
    }
}
