package behavioralpatterns.observer.example;

/**
 * Паттерн "Наблюдатель" (Observer) представляет поведенческий шаблон проектирования,
 * который использует отношение "один ко многим".
 * В этом отношении есть один наблюдаемый объект и множество наблюдателей.
 * И при изменении наблюдаемого объекта автоматически происходит оповещение всех наблюдателей.
 */
public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Bank bank = new Bank("Sberbank", stock);
        Broker broker = new Broker("Ivan Palich", stock);
        stock.market();
        broker.stopTrade();
        stock.market();
    }
}
