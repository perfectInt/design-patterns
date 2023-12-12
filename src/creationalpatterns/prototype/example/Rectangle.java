package creationalpatterns.prototype.example;

public class Rectangle implements Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Figure clone() {
        return new Rectangle(this.width, this.height);
    }

    @Override
    public void getInfo() {
        System.out.printf("Rectangle with %d width and %d height\n", this.width, this.height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
