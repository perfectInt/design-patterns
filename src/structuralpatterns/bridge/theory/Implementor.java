package structuralpatterns.bridge.theory;

/**
 * Implementor: определяет базовый интерфейс для конкретных реализаций.
 * Как правило, Implementor определяет только примитивные операции.
 * Более сложные операции, которые базируются на примитивных, определяются в Abstraction
 */
public abstract class Implementor {
    public abstract void operationImp();
}
