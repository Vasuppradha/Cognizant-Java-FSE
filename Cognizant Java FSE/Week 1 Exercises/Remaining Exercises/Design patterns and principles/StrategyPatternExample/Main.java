public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("Vasu", "1234567812345678"));
        context.executePayment(1500.75);

        context.setPaymentStrategy(new PayPalPayment("Vasu@email.com"));
        context.executePayment(860.40);
    }
}
