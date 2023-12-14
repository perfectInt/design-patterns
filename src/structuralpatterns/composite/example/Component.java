package structuralpatterns.composite.example;

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public void add(Component component) {}
    public void remove(Component component) {}
    public void print() {
        System.out.println(this.name);
    }
}
