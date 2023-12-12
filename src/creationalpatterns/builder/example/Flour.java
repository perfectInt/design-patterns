package creationalpatterns.builder.example;

public class Flour {
    public String sort;

    public Flour(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Flour{" +
                "sort='" + sort + '\'' +
                '}';
    }
}
