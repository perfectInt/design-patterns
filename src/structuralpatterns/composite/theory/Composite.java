package structuralpatterns.composite.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite: представляет компонент, который может содержать другие компоненты
 * и реализует механизм для их добавления и удаления
 */
public class Composite extends Component {

    List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println(this.name);
        children.forEach(Component::display);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }
}
