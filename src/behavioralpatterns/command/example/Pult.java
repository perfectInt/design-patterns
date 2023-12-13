package behavioralpatterns.command.example;

public class Pult {
    Command command;

    public Pult() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    public void pressUndo() {
        command.undo();
    }
}
