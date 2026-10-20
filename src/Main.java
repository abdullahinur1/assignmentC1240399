import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Delivery> deliveries = new ArrayList<>();

        System.out.print("How many deliveries?: ");
        int deliveryCount = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 1; i <= deliveryCount; i++) {
            System.out.print("Delivery " + i + " - type (R/E): ");
            String type = scanner.nextLine().trim();

            System.out.print("Delivery " + i + " - distance (km): ");
            int distance = Integer.parseInt(scanner.nextLine().trim());

            System.out.print("Delivery " + i + " - weight (kg): ");
            int weight = Integer.parseInt(scanner.nextLine().trim());

            if (type.equalsIgnoreCase("R")) {
                deliveries.add(new RegularDelivery(distance, weight));
            } else {
                deliveries.add(new ExpressDelivery(distance, weight));
            }
        }

        System.out.println("--- DELIVERY FEE SUMMARY ---");
        long total = 0;
        for (int i = 0; i < deliveries.size(); i++) {
            long fee = deliveries.get(i).calculateFee();
            System.out.println("Delivery " + (i + 1) + ": " + fee + " units");
            total += fee;
        }
        System.out.println("Total delivery fees: " + total + " units");

        scanner.close();

    }
}
