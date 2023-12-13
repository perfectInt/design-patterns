package behavioralpatterns.state.example;

public class SolidWaterState implements WaterState {
    @Override
    public void heat(Water water) {
        System.out.println("Превращаем лед в жидкость");
        water.waterState = new LiquidWaterState();
    }

    @Override
    public void frost(Water water) {
        System.out.println("Продолжаем заморозку льда");
    }
}
