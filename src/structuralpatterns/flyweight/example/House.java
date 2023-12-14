package structuralpatterns.flyweight.example;

public abstract class House {
    protected int stages;

    public abstract void build(double longitude, double latitude);
}
