package behavioralpatterns.mediator.example;

public class TesterColleague extends Colleague {
    public TesterColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.printf("Сообщение тестировщику: %s\n", message);
    }
}
