package creationalpatterns.prototype.example;

public class Circle implements Figure {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Figure clone() {
        return new Circle(this.radius);
    }

    @Override
    public void getInfo() {
        System.out.printf("Radius of circle is %d\n", this.radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
