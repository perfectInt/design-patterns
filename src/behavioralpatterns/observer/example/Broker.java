package behavioralpatterns.observer.example;

public class Broker implements Observer {
    protected String name;
    protected Observable stock;

    public Broker(String name, Observable stock) {
        this.name = name;
        this.stock = stock;
        this.stock.registerObserver(this);
    }

    @Override
    public void update(Object object) {
        StockInfo stockInfo = (StockInfo) object;
        if (stockInfo.usd > 30)
            System.out.printf("Брокер %s продает доллары. Курс доллара: %d\n", this.name, stockInfo.usd);
        else
            System.out.printf("Брокер %s покупает доллары. Курс доллара: %d\n", this.name, stockInfo.usd);
    }

    public void stopTrade() {
        stock.removeObserver(this);
        stock = null;
    }
}
