package creationalpatterns.abstractfactory.example;

public class Sword extends Weapon {
    @Override
    public void hit() {
        System.out.println("Fight with a sword");
    }
}
