package structuralpatterns.composite.example;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Component {

    List<Component> components = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void print() {
        System.out.println("Node: " + this.name);
        System.out.println("Subnodes: ");
        components.forEach(Component::print);
    }
}
