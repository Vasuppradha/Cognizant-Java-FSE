public class MobileApp implements Observer {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println("MobileApp" + name + " - New update: " + stockSymbol + " at Rs." + stockPrice);
    }
}
