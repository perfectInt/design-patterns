package behavioralpatterns.strategy.theory;

/**
 * Интерфейс Strategy, который определяет метод Algorithm().
 * Это общий интерфейс для всех реализующих его алгоритмов.
 * Вместо интерфейса здесь также можно было бы использовать абстрактный класс.
 */
public interface Strategy {
    void algorithm();
}
