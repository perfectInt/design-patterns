package creationalpatterns.factorymethod.example;

public abstract class Developer {

    private String name;

    public abstract House create();

    public Developer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
