package structuralpatterns.proxy.theory;

/**
 * Proxy: заместитель реального объекта. Хранит ссылку на реальный объект, контролирует к нему доступ,
 * может управлять его созданием и удалением.
 * При необходимости Proxy переадресует запросы объекту RealSubject
 */
public class Proxy extends Subject {

    RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null)
            realSubject = new RealSubject();
        realSubject.request();
    }
}
