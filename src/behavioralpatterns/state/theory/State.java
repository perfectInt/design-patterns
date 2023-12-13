package behavioralpatterns.state.theory;

/**
 * State: определяет интерфейс состояния
 */
public abstract class State {
    public abstract void handle(Context context);
}
