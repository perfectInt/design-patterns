package behavioralpatterns.state.theory;

/**
 * Context: представляет объект, поведение которого должно динамически изменяться в соответствии с состоянием.
 * Выполнение же конкретных действий делегируется объекту состояния
 */
public class Context {
    public State state;

    public Context(State state) {
        this.state = state;
    }

    public void request() {
        this.state.handle(this);
    }
}
