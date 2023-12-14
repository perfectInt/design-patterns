package structuralpatterns.bridge.example;

/**
 * Мост (Bridge) - структурный шаблон проектирования, который позволяет отделить абстракцию от реализации таким образом,
 * чтобы и абстракцию, и реализацию можно было изменять независимо друг от друга.
 */
public class Main {
    public static void main(String[] args) {
        Programmer freelancer = new FreelanceProgrammer(new JavaLanguage());
        freelancer.doWork();
        freelancer.earnMoney();
        freelancer.language = new CPPLanguage();
        freelancer.doWork();
        freelancer.earnMoney();
    }
}
