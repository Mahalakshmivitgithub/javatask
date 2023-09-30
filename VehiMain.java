class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println(year + " " + make + " " + model);
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

class Motorcycle extends Vehicle {
    private int topSpeed;

    public Motorcycle(String make, String model, int year, int topSpeed) {
        super(make, model, year);
        this.topSpeed = topSpeed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Top Speed: " + topSpeed + " mph");
    }
}

class Truck extends Vehicle {
    private int payloadCapacity;

    public Truck(String make, String model, int year, int payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Payload Capacity: " + payloadCapacity + " lbs");
    }
}

public class VehiMain {
    public static void main(String[] args) {
        // Example usage:
        Car car = new Car("Toyota", "Camry", 2022, 4);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, 120);
        Truck truck = new Truck("Ford", "F-150", 2023, 2000);

        car.displayInfo();
        System.out.println();
        motorcycle.displayInfo();
        System.out.println();
        truck.displayInfo();
    }
}