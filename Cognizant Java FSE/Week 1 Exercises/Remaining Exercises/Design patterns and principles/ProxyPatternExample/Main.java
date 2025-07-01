public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("nature.jpg");

        System.out.println("\n First call:");
        image1.display();

        System.out.println("\n Second call:");
        image1.display();

        Image image2 = new ProxyImage("sunset.png");
        System.out.println("\n Third call with new image:");
        image2.display();
    }
}
