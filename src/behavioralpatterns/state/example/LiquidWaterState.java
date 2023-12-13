package behavioralpatterns.state.example;

public class LiquidWaterState implements WaterState {
    @Override
    public void heat(Water water) {
        System.out.println("Превращаем жидкость в пар");
        water.waterState = new GasWaterState();
    }

    @Override
    public void frost(Water water) {
        System.out.println("Превращаем жидкость в лед");
        water.waterState = new SolidWaterState();
    }
}
