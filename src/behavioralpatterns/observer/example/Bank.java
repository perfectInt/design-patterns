package behavioralpatterns.observer.example;

public class Bank implements Observer {

    protected String name;
    Observable stock;

    public Bank(String name, Observable stock) {
        this.name = name;
        this.stock = stock;
        this.stock.registerObserver(this);
    }

    @Override
    public void update(Object object) {
        StockInfo stockInfo = (StockInfo) object;
        if (stockInfo.euro > 40)
            System.out.printf("Банк %s продает евро. Курс евро: %d\n", this.name, stockInfo.euro);
        else
            System.out.printf("Банк %s покупает евро. Курс евро: %d\n", this.name, stockInfo.euro);
    }
}
