package behavioralpatterns.observer.theory;

/**
 * Observable: представляет наблюдаемый объект.
 * Определяет три метода: addObserver() (для добавления наблюдателя),
 * removeObserver() (удаление набюдателя)
 * и notifyObservers() (уведомление наблюдателей)
 */
public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
