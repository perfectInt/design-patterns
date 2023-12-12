package creationalpatterns.builder.example;

public class Additive {
    public String name;

    public Additive(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Additive{" +
                "name='" + name + '\'' +
                '}';
    }
}
