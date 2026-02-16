package lessons.lesson13_inheritance;

public class PersonnelManagementSystem {
    public static void main(String[] args) {
        Manager newManager = new Manager("Саша", 1000, 500);
        Courier newCourier = new Courier("Серёжа", 1500, "Bicycle");

        newManager.displayInfo();
        newCourier.displayInfo();
    }
}

class Employee {
    String name;
    int salary;

    public Employee (String newName, int newSalary) {
        this.name = newName;
        this.salary = newSalary;
    }

    void displayInfo () {
        System.out.println("Имя: " + this.name + " | " + " Зарплата: " + this.salary);
    }
}

class Manager extends Employee {
    int bonus;

    public Manager (String name, int salary, int newBonus) {
        super(name, salary);
        this.bonus = newBonus;
    }

    @Override
    void displayInfo () {
        System.out.println("Имя: " + this.name + " | " + " Зарплата: " + this.salary + " | " + " Бонус: " + this.bonus);
    }
}

class Courier extends Employee {
    String vehicleType;

    public Courier (String name, int salary, String newVehicleType) {
        super(name, salary);
        this.vehicleType = newVehicleType;
    }

    @Override
    void displayInfo() {
        System.out.println("Имя: " + this.name + " | " + " Зарплата: " + this.salary + " | " +
                " Средство передвижения: " + this.vehicleType);
    }
}