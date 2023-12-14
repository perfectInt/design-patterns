package structuralpatterns.decorator.example;

public class PizzaDecorator extends Pizza {

    protected Pizza pizza;

    public PizzaDecorator(String name, Pizza pizza) {
        super(name);
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 0;
    }
}
