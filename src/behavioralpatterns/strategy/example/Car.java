package behavioralpatterns.strategy.example;

public class Car {
    protected int passengers;
    protected String model;
    protected Movable movable;

    public Car(int passengers, String model, Movable movable) {
        this.passengers = passengers;
        this.model = model;
        this.movable = movable;
    }

    public void move() {
        movable.move();
    }
}
