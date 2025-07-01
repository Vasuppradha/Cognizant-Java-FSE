public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobile1 = new MobileApp("MobileApp1");
        Observer web1 = new WebApp("WebApp1");

        stockMarket.registerObserver(mobile1);
        stockMarket.registerObserver(web1);

        stockMarket.setStockPrice("TCS", 3890.25);
        stockMarket.setStockPrice("INFY", 1423.75);

        stockMarket.deregisterObserver(web1);
        stockMarket.setStockPrice("WIPRO", 517.10);
    }
}
