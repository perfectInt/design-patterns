package creationalpatterns.prototype.theory;

/**
 * Prototype: определяет интерфейс для клонирования самого себя, который, как правило, представляет метод Clone()
 */
public abstract class Prototype {
    private int id;

    public Prototype(int id) {
        this.id = id;
    }

    public abstract Prototype clone();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
