public class WebApp implements Observer {
    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println("WebApp" + name + " - New update: " + stockSymbol + " at Rs." + stockPrice);
    }
}
