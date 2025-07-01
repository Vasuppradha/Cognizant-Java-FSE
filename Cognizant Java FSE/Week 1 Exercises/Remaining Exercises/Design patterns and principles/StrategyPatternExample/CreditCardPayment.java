public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String name;

    public CreditCardPayment(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println(name + " paid Rs." + amount + " using Credit Card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }
}
