package creationalpatterns.singleton.example;

public class OS {
    private static OS instance;
    private String name;

    protected OS(String name) {
        this.name = name;
    }

    public static OS getInstance(String name) {
        if (instance == null)
            instance = new OS(name);
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
