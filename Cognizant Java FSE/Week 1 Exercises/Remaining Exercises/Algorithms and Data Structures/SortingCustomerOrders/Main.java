public class Main {
   public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Alice", 750.50),
            new Order(102, "Bob", 1200.00),
            new Order(103, "Charlie", 450.75),
            new Order(104, "Diana", 980.25)
        };

        System.out.println(" Original Orders:");
        OrderSorter.displayOrders(orders);

        System.out.println("\n Sorted by Bubble Sort (ascending by totalPrice):");
        Order[] bubbleSorted = orders.clone();
        OrderSorter.bubbleSort(bubbleSorted);
        OrderSorter.displayOrders(bubbleSorted);

        System.out.println("\n Sorted by Quick Sort (ascending by totalPrice):");
        Order[] quickSorted = orders.clone();
        OrderSorter.quickSort(quickSorted, 0, quickSorted.length - 1);
        OrderSorter.displayOrders(quickSorted);
    }
}
