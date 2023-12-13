package behavioralpatterns.mediator.example;

/**
 * Паттерн Посредник (Mediator) представляет такой шаблон проектирования,
 * который обеспечивает взаимодействие множества объектов без необходимости ссылаться друг на друга.
 * Тем самым достигается слабосвязанность взаимодействующих объектов.
 */
public class Main {
    public static void main(String[] args) {
        ManagerMediator mediator = new ManagerMediator();
        Colleague customer = new CustomerColleague(mediator);
        Colleague programmer = new ProgrammerColleague(mediator);
        Colleague tester = new TesterColleague(mediator);
        mediator.customer = customer;
        mediator.programmer = programmer;
        mediator.tester = tester;
        customer.send("Есть заказ");
        programmer.send("Программа готова");
        tester.send("Программа протестирована");
    }
}
