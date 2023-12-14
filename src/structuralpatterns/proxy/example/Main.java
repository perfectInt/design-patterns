package structuralpatterns.proxy.example;

/**
 * Паттерн Заместитель (Proxy) предоставляет объект-заместитель, который управляет доступом к другому объекту.
 * То есть создается объект-суррогат, который может выступать в роли другого объекта и замещать его.
 */
public class Main {
    public static void main(String[] args) {
        DisplayTimetable displayTimetable = new DisplayTimetable();
        displayTimetable.printTimetable();
    }
}
