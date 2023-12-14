package structuralpatterns.composite.theory;

/**
 * Client: клиент, который использует компоненты
 */
public class Client {
    public void run() {
        Component root = new Composite("Root");
        Component leaf = new Leaf("Leaf");
        Composite subtree = new Composite("Subtree");
        root.add(leaf);
        root.add(subtree);
        root.display();
    }
}
