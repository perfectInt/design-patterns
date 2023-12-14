package structuralpatterns.decorator.example;

public class ItalianPizza extends Pizza {

    public ItalianPizza() {
        super("Italian pizza");
    }

    @Override
    public int getCost() {
        return 10;
    }
}
