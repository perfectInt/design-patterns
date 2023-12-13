package behavioralpatterns.templatemethod.example;

public class School extends Education {
    @Override
    public void enter() {
        System.out.println("Идем в первый класс");
    }

    @Override
    public void study() {
        System.out.println("Прогуливаем уроки, не делаем дз");
    }

    @Override
    public void getDocument() {
        System.out.println("Получаем аттестат об окончании школы (или справку в каких-то случаях:))");
    }
}
