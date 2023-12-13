package behavioralpatterns.observer.theory;

/**
 * Observer: представляет наблюдателя, который подписывается на все уведомления наблюдаемого объекта.
 * Определяет метод update(), который вызывается наблюдаемым объектом для уведомления наблюдателя.
 */
public interface Observer {
    void update();
}
