package structuralpatterns.bridge.theory;

/**
 * RefinedAbstraction: уточненная абстракция, наследуется от Abstraction и расширяет унаследованный интерфейс
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {

    }
}
