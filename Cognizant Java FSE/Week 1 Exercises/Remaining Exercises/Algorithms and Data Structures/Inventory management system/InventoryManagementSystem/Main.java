public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Laptop", 5, 75000);
        Product p2 = new Product(102, "Keyboard", 15, 1500);
        Product p3 = new Product(103, "Mouse", 30, 800);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        System.out.println("\nInventory:");
        manager.displayInventory();

        manager.updateProduct(102, 20, 1600);
        manager.deleteProduct(103);

        System.out.println("\nUpdated Inventory:");
        manager.displayInventory();
    }
}
