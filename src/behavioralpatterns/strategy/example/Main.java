package behavioralpatterns.strategy.example;

/**
 * Паттерн Стратегия (Strategy) представляет шаблон проектирования, который определяет набор алгоритмов,
 * инкапсулирует каждый из них и обеспечивает их взаимозаменяемость.
 * В зависимости от ситуации мы можем легко заменить один используемый алгоритм другим.
 * При этом замена алгоритма происходит независимо от объекта, который использует данный алгоритм.
 */
public class Main {
    public static void main(String[] args) {
        Car auto = new Car(4, "Volvo", new PetrolMove());
        auto.move();
        auto.movable = new ElectricMove();
        auto.move();
    }
}
