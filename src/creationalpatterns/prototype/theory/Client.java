package creationalpatterns.prototype.theory;

/**
 * Client: создает объекты прототипов с помощью метода Clone()
 */
public class Client {

    public void operation() {
        Prototype prototype = new ConcretePrototype1(1);
        Prototype clone = prototype.clone();
        prototype = new ConcretePrototype2(2);
        clone = prototype.clone();
    }
}
