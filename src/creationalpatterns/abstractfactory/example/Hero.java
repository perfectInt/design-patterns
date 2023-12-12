package creationalpatterns.abstractfactory.example;

public class Hero {
    private Weapon weapon;
    private Movement movement;

    public Hero(HeroFactory factory) {
        weapon = factory.createWeapon();
        movement = factory.createMovement();
    }

    public void run() {
        movement.move();
    }

    public void hit() {
        weapon.hit();
    }
}
