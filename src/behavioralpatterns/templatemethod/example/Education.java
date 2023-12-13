package behavioralpatterns.templatemethod.example;

public abstract class Education {
    public void learn() {
        enter();
        study();
        passExams();
        getDocument();
    }

    public abstract void enter();
    public abstract void study();
    public void passExams() {
        System.out.println("Сдаем выпускные экзамены");
    };
    public abstract void getDocument();
}
