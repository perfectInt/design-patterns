package behavioralpatterns.command.theory;

/**
 * Invoker: инициатор команды - вызывает команду для выполнения определенного запроса
 */
public class Invoker {
    protected Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void run() {
        command.execute();
    }

    public void cancel() {
        command.undo();
    }
}
