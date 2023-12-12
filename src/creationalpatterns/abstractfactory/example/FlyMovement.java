package creationalpatterns.abstractfactory.example;

public class FlyMovement extends Movement {

    @Override
    public void move() {
        System.out.println("Flying!");
    }
}
