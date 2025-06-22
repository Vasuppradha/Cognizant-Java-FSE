
import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Dress", "Fashion"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Watch", "Accessories"),
            new Product(4, "Smartphone", "Electronics"),
            new Product(5, "Laptop", "Electronics")
        };

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        Product found1 = linearSearch(products, "Dress");
        System.out.println("Linear Search: " + (found1 != null ? found1 : "Not Found"));

        Product found2 = binarySearch(products, "Dress");
        System.out.println("Binary Search: " + (found2 != null ? found2 : "Not Found"));
    }

    public static Product linearSearch(Product[] products, String targetName){
        for(Product p : products){
            if(p.productName.equalsIgnoreCase(targetName)){
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetName){
        int left = 0;
        int right = products.length - 1;

        while(left < right){
            int mid = (left + right)/2;
            int comp = products[mid].productName.compareToIgnoreCase(targetName);

            if(comp == 0)
                return products[mid];
            else if (comp < 0)
                left = mid + 1;
            else
                right = mid -1;
        }
        return null;
    }
}