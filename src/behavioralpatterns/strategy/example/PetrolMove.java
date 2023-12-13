package behavioralpatterns.strategy.example;

public class PetrolMove implements Movable {
    @Override
    public void move() {
        System.out.println("Перемещение на бензине");
    }
}
