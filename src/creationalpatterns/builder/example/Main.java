package creationalpatterns.builder.example;

/**
 * Строитель (Builder) - шаблон проектирования,
 * который инкапсулирует создание объекта и позволяет разделить его на различные этапы.
 */
public class Main {
    public static void main(String[] args) {
        Baker baker = new Baker();
        BreadBuilder builder = new RyeBreadBuilder();
        Bread ryeBread = baker.bake(builder);
        System.out.println(ryeBread);

        builder = new WheatBreadBuilder();
        Bread wheatBread = baker.bake(builder);
        System.out.println(wheatBread);
    }
}
