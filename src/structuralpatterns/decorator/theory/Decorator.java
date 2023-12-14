package structuralpatterns.decorator.theory;

/**
 * Decorator: собственно декоратор,
 * реализуется в виде абстрактного класса и имеет тот же базовый класс, что и декорируемые объекты.
 * Поэтому базовый класс Component должен быть по возможности легким и определять только базовый интерфейс.
 */
public abstract class Decorator extends Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null)
            component.operation();
    }
}
