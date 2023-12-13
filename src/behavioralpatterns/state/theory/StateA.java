package behavioralpatterns.state.theory;

/**
 * Классы StateA и StateB - конкретные реализации состояний
 */
public class StateA extends State {
    @Override
    public void handle(Context context) {
        context.state = new StateB();
    }
}
