class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

class Technician extends Employee {
    private String specialization;

    public Technician(String name, int employeeId, String specialization) {
        super(name, employeeId);
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}

public class EmpMain {
    public static void main(String[] args) {
        // Creating instances of Manager and Technician
        Manager manager = new Manager("Maha", 101, "IT");
        Technician technician = new Technician("Seenu", 102, "Network");

        // Displaying details of Manager
        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.println();

        // Displaying details of Technician
        System.out.println("Technician Details:");
        technician.displayDetails();
    }
}