package behavioralpatterns.memento.theory;

/**
 * Originator: создает объект хранителя для сохранения своего состояния
 */
public class Originator {
    public String state;
    public void setMemento(Memento memento) {
        state = memento.state;
    }
    public Memento createMemento() {
        return new Memento(state);
    }
}
