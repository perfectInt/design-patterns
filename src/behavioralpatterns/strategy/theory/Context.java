package behavioralpatterns.strategy.theory;

/**
 * Класс Context хранит ссылку на объект Strategy и связан с интерфейсом Strategy отношением агрегации.
 */
public class Context {
    public Strategy contextStrategy;

    public Context(Strategy contextStrategy) {
        this.contextStrategy = contextStrategy;
    }

    public void executeAlgo() {
        contextStrategy.algorithm();
    }
}
