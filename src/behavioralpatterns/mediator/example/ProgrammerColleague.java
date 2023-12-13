package behavioralpatterns.mediator.example;

public class ProgrammerColleague extends Colleague {
    public ProgrammerColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.printf("Сообщение программисту: %s\n", message);
    }
}
