package behavioralpatterns.strategy.example;

public class ElectricMove implements Movable {
    @Override
    public void move() {
        System.out.println("Перемещение на электричестве");
    }
}
