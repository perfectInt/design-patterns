package behavioralpatterns.command.example;

/**
 * Паттерн "Команда" (Command) позволяет инкапсулировать запрос на выполнение определенного действия в виде отдельного объекта.
 * Этот объект запроса на действие и называется командой.
 * При этом объекты, инициирующие запросы на выполнение действия, отделяются от объектов, которые выполняют это действие.
 */
public class Main {
    public static void main(String[] args) {
        Pult pult = new Pult();
        TV tv = new TV();
        pult.setCommand(new TVOnCommand(tv));
        pult.pressButton();
        pult.pressUndo();
    }
}
