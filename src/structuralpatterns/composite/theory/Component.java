package structuralpatterns.composite.theory;

/**
 * Component: определяет интерфейс для всех компонентов в древовидной структуре
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void display();
    public abstract void add(Component c);
    public abstract void remove(Component c);
}
