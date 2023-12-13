package behavioralpatterns.mediator.theory;

/**
 * ConcreteColleague1 и ConcreteColleague2: конкретные классы коллег,
 * которые обмениваются друг с другом через объект Mediator
 */
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {

    }
}
