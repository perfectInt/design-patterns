package structuralpatterns.composite.theory;

/**
 * Leaf: представляет отдельный компонент, который не может содержать другие компоненты
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println(this.name);
    }

    @Override
    public void add(Component c) {
        throw new RuntimeException();
    }

    @Override
    public void remove(Component c) {
        throw new RuntimeException();
    }
}
