package structuralpatterns.bridge.theory;

/**
 * Abstraction: определяет базовый интерфейс и хранит ссылку на объект Implementor.
 * Выполнение операций в Abstraction делегируется методам объекта Implementor
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operationImp();
    }
}
