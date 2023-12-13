package behavioralpatterns.mediator.example;

public class ManagerMediator extends Mediator {

    public Colleague customer;
    public Colleague programmer;
    public Colleague tester;

    @Override
    public void send(String msg, Colleague colleague) {
        if (colleague == customer) {
            programmer.notify(msg);
        } else if (colleague == programmer) {
            tester.notify(msg);
        } else if (colleague == tester) {
            customer.notify(msg);
        }
    }
}
