public class Main {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        PaymentProcessor paypalProcessor = new PayPalAdapter(payPal);
        paypalProcessor.processPayment(500.00);

        Stripe stripe = new Stripe();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        stripeProcessor.processPayment(1200.50);
    }
}
