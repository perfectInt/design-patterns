package structuralpatterns.decorator.example;

public class BulgarianPizza extends Pizza {
    public BulgarianPizza() {
        super("Bulgarian pizza");
    }

    @Override
    public int getCost() {
        return 8;
    }
}
