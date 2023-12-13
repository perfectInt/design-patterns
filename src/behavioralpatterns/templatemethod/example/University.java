package behavioralpatterns.templatemethod.example;

public class University extends Education {

    @Override
    public void enter() {
        System.out.println("Поступаем в вуз");
    }

    @Override
    public void study() {
        System.out.println("Учимся, не спим ночами");
    }

    @Override
    public void passExams() {
        System.out.println("Защищаем диплом");
    }

    @Override
    public void getDocument() {
        System.out.println("Получаем диплом");
    }
}
