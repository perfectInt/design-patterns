package structuralpatterns.decorator.example;

public class CheesePizza extends PizzaDecorator {
    public CheesePizza(Pizza pizza) {
        super(pizza.name + " with cheese", pizza);
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 5;
    }
}
