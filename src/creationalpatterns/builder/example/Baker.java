package creationalpatterns.builder.example;

public class Baker {
    public Bread bake(BreadBuilder builder) {
        builder.createBread();
        builder.setFlour();
        builder.setSalt();
        builder.setAdditive();
        return builder.bread;
    }
}
