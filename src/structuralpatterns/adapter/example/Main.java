package structuralpatterns.adapter.example;

/**
 * Паттерн Адаптер (Adapter) предназначен для преобразования интерфейса одного класса в интерфейс другого.
 * Благодаря реализации данного паттерна мы можем использовать вместе классы с несовместимыми интерфейсами.
 */
public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Auto auto = new Auto();
        driver.travel(auto);
        Camel camel = new Camel();
        Transport camelTransport = new CamelToTransportAdapter(camel);
        driver.travel(camelTransport);
    }
}
