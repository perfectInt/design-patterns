package creationalpatterns.factorymethod.example;

/**
 * Фабричный метод (Factory Method) - это паттерн, который определяет интерфейс для создания объектов некоторого класса,
 * но непосредственное решение о том, объект какого класса создавать происходит в подклассах.
 * То есть паттерн предполагает, что базовый класс делегирует создание объектов классам-наследникам.
 */
public class Main {
    public static void main(String[] args) {
        Developer firstDev = new PanelDeveloper("Dave");
        House firstHouse = firstDev.create();

        Developer secondDev = new WoodDeveloper("John");
        House secondHouse = secondDev.create();
    }
}
