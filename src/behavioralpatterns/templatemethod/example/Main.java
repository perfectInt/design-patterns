package behavioralpatterns.templatemethod.example;

/**
 * Шаблонный метод (Template Method) определяет общий алгоритм поведения подклассов,
 * позволяя им переопределить отдельные шаги этого алгоритма без изменения его структуры.
 */
public class Main {
    public static void main(String[] args) {
        School school = new School();
        University university = new University();
        school.learn();
        university.learn();
    }
}
