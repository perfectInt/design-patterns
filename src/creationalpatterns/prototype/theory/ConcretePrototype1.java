package creationalpatterns.prototype.theory;

/**
 * ConcretePrototype1 и ConcretePrototype2: конкретные реализации прототипа. Реализуют метод Clone()
 */
public class ConcretePrototype1 extends Prototype {

    public ConcretePrototype1(int id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1(getId());
    }
}
