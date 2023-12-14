package structuralpatterns.decorator.example;

public class TomatoPizza extends PizzaDecorator {
    public TomatoPizza(Pizza pizza) {
        super(pizza.name + " with tomato", pizza);
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 3;
    }
}
