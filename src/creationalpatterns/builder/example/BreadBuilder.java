package creationalpatterns.builder.example;

public abstract class BreadBuilder {
    public Bread bread;

    public void createBread() {
        bread = new Bread();
    }

    public abstract void setFlour();
    public abstract void setSalt();
    public abstract void setAdditive();
}
