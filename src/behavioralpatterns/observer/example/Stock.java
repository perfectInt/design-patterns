package behavioralpatterns.observer.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stock implements Observable {

    StockInfo stockInfo;
    List<Observer> observers;

    public Stock() {
        stockInfo = new StockInfo();
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(stockInfo));
    }

    public void market() {
        Random random = new Random();
        stockInfo.usd = random.nextInt(20, 40);
        stockInfo.euro = random.nextInt(30, 50);
        notifyObservers();
    }
}
