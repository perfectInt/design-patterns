package structuralpatterns.flyweight.theory;

/**
 * ConcreteFlyweight: конкретный класс разделяемого приспособленца.
 * Реализует интерфейс, объявленный в типе Flyweight, и при необходимости добавляет внутреннее состояние.
 * Причем любое сохраняемое им состояние должно быть внутренним, не зависящим от контекста
 */
public class ConcreteFlyweight extends Flyweight {
    int internalState;

    @Override
    public void operation(int externalState) {

    }
}
