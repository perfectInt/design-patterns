package behavioralpatterns.command.theory;

/**
 * Client: клиент - создает команду и устанавливает ее получателя с помощью метода setCommand()
 */
public class Client {
    public void run() {
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        invoker.setCommand(command);
        invoker.run();
    }
}
