package behavioralpatterns.state.example;

/**
 * Состояние (State) - шаблон проектирования, который позволяет объекту изменять свое поведение
 * в зависимости от внутреннего состояния.
 */
public class Main {
    public static void main(String[] args) {
        Water water = new Water(new LiquidWaterState());
        water.heat();
        water.frost();
        water.frost();
    }
}
