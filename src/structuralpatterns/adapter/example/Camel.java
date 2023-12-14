package structuralpatterns.adapter.example;

public class Camel implements Animal {
    @Override
    public void move() {
        System.out.println("riding a camel");
    }
}
