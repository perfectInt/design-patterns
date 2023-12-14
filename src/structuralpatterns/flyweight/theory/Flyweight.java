package structuralpatterns.flyweight.theory;

/**
 * Flyweight: определяет интерфейс, через который приспособленцы-разделяемые объекты
 * могут получать внешнее состояние или воздействовать на него
 */
public abstract class Flyweight {
    public abstract void operation(int externalState);
}
