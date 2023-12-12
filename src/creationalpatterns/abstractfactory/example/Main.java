package creationalpatterns.abstractfactory.example;

/**
 * Паттерн "Абстрактная фабрика" (Abstract Factory) предоставляет интерфейс для создания семейств
 * взаимосвязанных объектов с определенными интерфейсами без указания конкретных типов данных объектов.
 */
public class Main {
    public static void main(String[] args) {
        Hero elf = new Hero(new ElfFactory());
        elf.hit();
        elf.run();

        Hero warrior = new Hero(new WarriorFactory());
        warrior.run();
        warrior.hit();
    }
}
