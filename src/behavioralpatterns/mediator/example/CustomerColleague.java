package behavioralpatterns.mediator.example;

public class CustomerColleague extends Colleague {
    public CustomerColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.printf("Сообщение заказчику: %s\n", message);
    }
}
