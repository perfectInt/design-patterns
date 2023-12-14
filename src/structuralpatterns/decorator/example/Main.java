package structuralpatterns.decorator.example;

/**
 * Декоратор (Decorator) представляет структурный шаблон проектирования,
 * который позволяет динамически подключать к объекту дополнительную функциональность.
 */
public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new ItalianPizza();
        pizza1 = new TomatoPizza(pizza1);
        System.out.println(pizza1.name + ": " + pizza1.getCost());

        Pizza pizza2 = new ItalianPizza();
        pizza2 = new CheesePizza(pizza2);
        System.out.println(pizza2.name + ": " + pizza2.getCost());

        Pizza pizza3 = new BulgarianPizza();
        pizza3 = new TomatoPizza(pizza3);
        pizza3 = new CheesePizza(pizza3);
        System.out.println(pizza3.name + ": " + pizza3.getCost());
    }
}
