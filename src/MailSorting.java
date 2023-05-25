import java.util.Scanner;

public class MailSorting {
    private String city;
    private String street;
    private String house;
    private String apartment;
    private int packageCount;
    private double totalCost;

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter city: ");
        city = scanner.nextLine();

        System.out.print("Enter street: ");
        street = scanner.nextLine();

        System.out.print("Enter house number: ");
        house = scanner.nextLine();

        System.out.print("Enter apartment number: ");
        apartment = scanner.nextLine();

        System.out.print("Enter package count: ");
        packageCount = scanner.nextInt();

        System.out.print("Enter total cost: ");
        totalCost = scanner.nextDouble();
    }

    public void display() {
        System.out.println("City: " + city);
        System.out.println("Street: " + street);
        System.out.println("House number: " + house);
        System.out.println("Apartment number: " + apartment);
        System.out.println("Package count: " + packageCount);
        System.out.println("Total cost: " + totalCost);
    }

    public int calculateTotalPackageCount() {
        return packageCount;
    }

    public double calculateTotalCost() {
        return totalCost;
    }

    public static void main(String[] args) {
        MailSorting sorting = new MailSorting();

        sorting.input();
        sorting.display();

        int totalPackages = sorting.calculateTotalPackageCount();
        double totalCost = sorting.calculateTotalCost();

        System.out.println("Total package count: " + totalPackages);
        System.out.println("Total cost: " + totalCost);
    }
}

