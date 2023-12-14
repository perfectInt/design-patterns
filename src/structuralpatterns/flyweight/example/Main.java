package structuralpatterns.flyweight.example;

/**
 * Паттерн Приспособленец (Flyweight) - структурный шаблон проектирования,
 * который позволяет использовать разделяемые объекты сразу в нескольких контекстах.
 * Данный паттерн используется преимущественно для оптимизации работы с памятью.
 */
public class Main {
    public static void main(String[] args) {
        double longitude = 37.61;
        double latitude = 55.74;

        HouseFactory houseFactory = new HouseFactory();
        for (int i = 0; i < 5; i++) {
            House panelHouse = houseFactory.getHouse("Panel");
            if (panelHouse != null)
                panelHouse.build(longitude, latitude);
            longitude += 0.1;
            latitude += 0.1;
        }

        for (int i = 0; i < 5; i++) {
            House brickHouse = houseFactory.getHouse("Brick");
            if (brickHouse != null)
                brickHouse.build(longitude, latitude);
            longitude += 0.1;
            latitude += 0.1;
        }
    }
}
