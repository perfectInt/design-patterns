package creationalpatterns.singleton.theory;

/**
 * Одиночка (Singleton, Синглтон) - порождающий паттерн,
 * который гарантирует, что для определенного класса будет создан только один объект,
 * а также предоставит к этому объекту точку доступа.
 * Синглтон позволяет создать объект только при его необходимости. Если объект не нужен, то он не будет создан.
 * В этом отличие синглтона от глобальных переменных.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
