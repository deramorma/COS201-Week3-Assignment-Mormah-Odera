import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter the price per item: ");
        double price = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        if (price < 0 || quantity <= 0) {
            System.out.println("Invalid price or quantity.");
            input.close();
            return;
        }

        double totalCost = price * quantity;

        System.out.println("Item: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total cost: %.2f%n", totalCost);

        input.close();
    }
}
