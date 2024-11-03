package Week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Sedan"));
        vehicles.add(new Truck("Pickup", 80000, 75));
        vehicles.add(new Motorcycle("Sport Bike", 12000, 85));

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.service());
            vehicle.simulateYear();

            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                car.drive(200);
                System.out.println("Drove Car for 200 miles.");
            } else if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                truck.haul(6000);
                System.out.println("Truck hauled 6000 pounds.");
            } else if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                motorcycle.race(100);
                System.out.println("Motorcycle raced for 100 miles.");
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSelect a vehicle for maintenance:");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println((i + 1) + ". " + vehicles.get(i).getModelName());
        }
        int choice = scanner.nextInt();
        if (choice > 0 && choice <= vehicles.size()) {
            Vehicle selectedVehicle = vehicles.get(choice - 1);
            System.out.println("\nPerforming maintenance on " + selectedVehicle.getModelName());
            selectedVehicle.performMaintenance(selectedVehicle);
        } else {
            System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}

