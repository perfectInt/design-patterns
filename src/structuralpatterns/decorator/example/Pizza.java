package structuralpatterns.decorator.example;

public abstract class Pizza {
    public String name;

    public Pizza(String name) {
        this.name = name;
    }

    public abstract int getCost();
}
