import java.util.Scanner;

public class ExtendedMailSorting extends MailSorting {
    private String recipientName;
    private boolean expressDelivery;

    public void inputExtendedData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter recipient name: ");
        recipientName = scanner.nextLine();

        System.out.print("Is it an express delivery? (true/false): ");
        expressDelivery = scanner.nextBoolean();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Recipient name: " + recipientName);
        System.out.println("Express delivery: " + expressDelivery);
    }

    public static void main(String[] args) {
        ExtendedMailSorting sorting = new ExtendedMailSorting();

        sorting.input();
        sorting.inputExtendedData();
        sorting.display();

        int totalPackages = sorting.calculateTotalPackageCount();
        double totalCost = sorting.calculateTotalCost();

        System.out.println("Total package count: " + totalPackages);
        System.out.println("Total cost: " + totalCost);
    }
}

