package behavioralpatterns.mediator.theory;

/**
 * ConcreteMediator: конкретный посредник, реализующий интерфейс типа Mediator
 */
public class ConcreteMediator extends Mediator {

    public ConcreteColleague1 colleague1;
    public ConcreteColleague2 colleague2;

    @Override
    public void send(String msg, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.notify(msg);
        } else {
            colleague1.notify(msg);
        }
    }
}
