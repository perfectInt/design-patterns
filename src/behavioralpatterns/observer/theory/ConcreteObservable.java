package behavioralpatterns.observer.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteObservable: конкретная реализация интерфейса Observable. Определяет коллекцию объектов наблюдателей.
 */
public class ConcreteObservable implements Observable {

    List<Observer> observers;

    public ConcreteObservable() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
