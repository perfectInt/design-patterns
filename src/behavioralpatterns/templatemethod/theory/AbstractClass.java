package behavioralpatterns.templatemethod.theory;

/**
 * AbstractClass: определяет шаблонный метод TemplateMethod(), который реализует алгоритм.
 * Алгоритм может состоять из последовательности вызовов других методов,
 * часть из которых может быть абстрактными и должны быть переопределены в классах-наследниках.
 * При этом сам метод TemplateMethod(), представляющий структуру алгоритма, переопределяться не должен.
 */
public abstract class AbstractClass {
    public void templateMethod() {
        operation1();
        operation2();
    }

    public abstract void operation1();
    public abstract void operation2();
}
