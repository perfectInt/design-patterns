package creationalpatterns.builder.example;

public class Bread {

    public Flour flour;
    public Salt salt;
    public Additive additive;

    @Override
    public String toString() {
        return "Bread{" +
                "flour=" + flour +
                ", salt=" + salt +
                ", additive=" + additive +
                '}';
    }
}
