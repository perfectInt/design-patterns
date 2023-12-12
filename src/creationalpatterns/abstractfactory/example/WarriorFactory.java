package creationalpatterns.abstractfactory.example;

public class WarriorFactory extends HeroFactory {

    @Override
    public Movement createMovement() {
        return new RunMovement();
    }

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
