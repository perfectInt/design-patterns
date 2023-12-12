package creationalpatterns.abstractfactory.example;

public class RunMovement extends Movement {
    @Override
    public void move() {
        System.out.println("Running!");
    }
}
