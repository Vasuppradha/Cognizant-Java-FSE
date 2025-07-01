import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers;
    private String stockSymbol;
    private double stockPrice;

    public StockMarket() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void deregisterObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stockSymbol, stockPrice);
        }
    }

    public void setStockPrice(String symbol, double price) {
        this.stockSymbol = symbol;
        this.stockPrice = price;
        System.out.println("\n Stock price updated: " + symbol + " = Rs." + price);
        notifyObservers();
    }
}
