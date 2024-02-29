import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static void viewRentedVehicles(List<Vehicel> rentedVehicles) {
        System.out.println("Rented Vehicles:");
        for (Vehicel vehicle : rentedVehicles) {
            vehicle.displayDetails();
            System.out.println();
        }
    }
    private static void car(List<Vehicel> rentedVehicles) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Car Model: ");
        String model = input.next();
        System.out.print("Enter Rental Days: ");
        int days = input.nextInt();
        Vehicel car = new Car(model, days);
        rentedVehicles.add(car);
        System.out.println("Rental Details:");
        car.displayDetails();
    }
    private static void bike(List<Vehicel> rentedVehicles) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Bike Brand: ");
        String brand = input.next();
        System.out.print("Enter Rental Hours: ");
        int hours = input.nextInt();

        Vehicel bike = new Bike(brand, hours);
        rentedVehicles.add(bike);
        System.out.println("Rental Details:");
        bike.displayDetails();
    }
        private static void truck(List<Vehicel> rentedVehicles) {
            Scanner input= new Scanner(System.in);
            System.out.print("Enter Truck Type: ");
            String type = input.next();
            System.out.print("Enter Rental Weeks: ");
            int weeks =input.nextInt();
            Vehicel truck = new Truck(type, weeks);
            rentedVehicles.add(truck);
            System.out.println("Rental Details:");
            truck.displayDetails();
        }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        List<Vehicel> rentedVehicles=new ArrayList<>();
        int chose;
        do{
            System.out.println("Vehicel System.");
            System.out.println("  1. Rente Car");
            System.out.println("  2. Rente Bike");
            System.out.println("  3. Rente Truck");
            System.out.println("  4. Viwe Rented Vehicel.");
            System.out.println("  5.Exite");

        switch (chose = input.nextInt()) {
            case 1:
            car(rentedVehicles);
                break;
            case 2:
            bike(rentedVehicles);
                break;
            case 3:
           truck(rentedVehicles);
                break;
            case 4:
                viewRentedVehicles(rentedVehicles);
                break;
            case 5:
                System.out.println("Exite");
                break;
            default:
                System.out.println("Please Enter from 1To5 ");
        }
        }while (chose!=5);

    }
}