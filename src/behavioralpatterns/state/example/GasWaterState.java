package behavioralpatterns.state.example;

public class GasWaterState implements WaterState {
    @Override
    public void heat(Water water) {
        System.out.println("Повышаем температуру водяного пара");
    }

    @Override
    public void frost(Water water) {
        System.out.println("Превращаем водяной пар в жидкость");
        water.waterState = new LiquidWaterState();
    }
}
