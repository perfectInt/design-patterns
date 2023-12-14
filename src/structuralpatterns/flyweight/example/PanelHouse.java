package structuralpatterns.flyweight.example;

public class PanelHouse extends House {

    public PanelHouse() {
        stages = 16;
    }

    @Override
    public void build(double longitude, double latitude) {
        System.out.printf("Панельный 16-этажный дом с координатами: (%.2f, %.2f)\n", longitude, latitude);
    }
}
