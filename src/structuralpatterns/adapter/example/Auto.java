package structuralpatterns.adapter.example;

public class Auto implements Transport {
    @Override
    public void drive() {
        System.out.println("driving a car");
    }
}
