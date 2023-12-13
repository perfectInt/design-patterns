package behavioralpatterns.command.theory;

/**
 * Command: интерфейс, представляющий команду.
 * Обычно определяет метод execute() для выполнения действия,
 * а также нередко включает метод undo(), реализация которого должна заключаться в отмене действия команды
 */
public abstract class Command {
    public abstract void execute();
    public abstract void undo();
}
