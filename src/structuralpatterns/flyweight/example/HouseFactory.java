package structuralpatterns.flyweight.example;

import java.util.HashMap;
import java.util.Map;

public class HouseFactory {
    Map<String, House> houseMap = new HashMap<>();

    public HouseFactory() {
        houseMap.put("Panel", new PanelHouse());
        houseMap.put("Brick", new BrickHouse());
    }

    public House getHouse(String key) {
        return houseMap.getOrDefault(key, null);
    }
}
