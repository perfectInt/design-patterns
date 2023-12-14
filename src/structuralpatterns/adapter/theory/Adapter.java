package structuralpatterns.adapter.theory;

/**
 * Adapter: собственно адаптер, который позволяет работать с объектами Adaptee как с объектами Target.
 */
public class Adapter extends Target {
    private final Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
