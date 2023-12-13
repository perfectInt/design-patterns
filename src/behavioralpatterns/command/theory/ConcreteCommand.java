package behavioralpatterns.command.theory;

/**
 * ConcreteCommand: конкретная реализация команды, реализует метод execute(),
 * в котором вызывается определенный метод, определенный в классе Receiver
 */
public class ConcreteCommand extends Command {

    protected Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.operation();
    }

    @Override
    public void undo() {

    }
}
