package creationalpatterns.abstractfactory.example;

public abstract class HeroFactory {
    public abstract Movement createMovement();
    public abstract Weapon createWeapon();
}
