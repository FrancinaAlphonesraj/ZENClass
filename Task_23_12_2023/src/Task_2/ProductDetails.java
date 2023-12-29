package Task_2;

import java.util.Scanner;

public class ProductDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting information for five products and storing in an array
        Product[] products = new Product[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Enter PID: ");
            int pid = scanner.nextInt();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();

            // Creating a new Product object and adding it to the array
            products[i] = new Product(pid, price, quantity);
        }

        // Finding PID of the product with the highest price
        int maxPricePid = findMaxPriceProduct(products);
        System.out.println("\nProduct with the highest price (PID): " + maxPricePid);

        // Calculating and displaying total amount spent on all products
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: $" + totalAmountSpent);
    }

    // Method to find PID of the product with the highest price
    private static int findMaxPriceProduct(Product[] products) {
        double maxPrice = Double.MIN_VALUE;
        int maxPricePid = -1;

        for (Product product : products) {
            if (product.getPrice() > maxPrice) {
                maxPrice = product.getPrice();
                maxPricePid = product.getPid();
            }
        }

        return maxPricePid;
    }

    // Method to calculate total amount spent on all products
    private static double calculateTotalAmountSpent(Product[] products) {
        double totalAmountSpent = 0;

        for (Product product : products) {
            totalAmountSpent += product.getPrice() * product.getQuantity();
        }

        return totalAmountSpent;
    }
}

