package structuralpatterns.flyweight.example;

public class BrickHouse extends House {

    public BrickHouse() {
        stages = 5;
    }

    @Override
    public void build(double longitude, double latitude) {
        System.out.printf("Кирпичный 5-этажный дом с координатами: (%.2f, %.2f)\n", longitude, latitude);
    }
}
