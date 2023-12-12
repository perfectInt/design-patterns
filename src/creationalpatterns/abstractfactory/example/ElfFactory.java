package creationalpatterns.abstractfactory.example;

public class ElfFactory extends HeroFactory {

    @Override
    public Movement createMovement() {
        return new FlyMovement();
    }

    @Override
    public Weapon createWeapon() {
        return new Arbalet();
    }
}
