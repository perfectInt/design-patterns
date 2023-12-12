package creationalpatterns.prototype.example;

/**
 * Паттерн Прототип (Prototype) позволяет создавать объекты на основе уже ранее созданных объектов-прототипов.
 * То есть по сути данный паттерн предлагает технику клонирования объектов.
 */
public class Main {
    public static void main(String[] args) {
        Figure figure = new Rectangle(30, 40);
        Figure clonedFigure = figure.clone();
        figure.getInfo();
        clonedFigure.getInfo();

        // То же самое можно сделать и с кругом
    }
}
