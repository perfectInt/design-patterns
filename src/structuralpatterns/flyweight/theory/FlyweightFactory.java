package structuralpatterns.flyweight.theory;

import java.util.HashMap;
import java.util.Map;

/**
 * FlyweightFactory: фабрика приспособленцев - создает объекты разделяемых приспособленцев.
 * Так как приспособленцы разделяются, то клиент не должен создавать их напрямую.
 * Все созданные объекты хранятся в пуле.
 * В примере выше для определения пула используется объект Hashtable, но это не обязательно.
 * Можно применять и другие классы коллекций.
 * Однако в зависимости от сложности структуры, хранящей разделяемые объекты,
 * особенно если у нас большое количество приспособленцев,
 * то может увеличиваться время на поиск нужного приспособленца -
 * наверное это один из немногих недостатков данного паттерна.
 */
public class FlyweightFactory {
    Map<String, Flyweight> flyweightMap = new HashMap<>();

    public FlyweightFactory() {
        flyweightMap.put("X", new ConcreteFlyweight());
        flyweightMap.put("Y", new ConcreteFlyweight());
        flyweightMap.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        if (!flyweightMap.containsKey(key))
            flyweightMap.put(key, new ConcreteFlyweight());
        return flyweightMap.get(key);
    }
}
