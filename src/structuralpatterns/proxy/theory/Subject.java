package structuralpatterns.proxy.theory;

/**
 * Subject: определяет общий интерфейс для Proxy и RealSubject. Поэтому Proxy может использоваться вместо RealSubject
 */
public abstract class Subject {
    public abstract void request();
}
