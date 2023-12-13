package behavioralpatterns.state.example;

public class Water {
    public WaterState waterState;

    public Water(WaterState waterState) {
        this.waterState = waterState;
    }

    public void heat() {
        waterState.heat(this);
    }

    public void frost() {
        waterState.frost(this);
    }
}
