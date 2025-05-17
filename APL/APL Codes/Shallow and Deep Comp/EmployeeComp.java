class Employee1 {
    private final int id;  // Readonly field
    private String name;
    private int experience;
    private double salary;

    // Constructor
    public Employee1(int id, String name, int experience, double salary) {
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee { ID: " + id + ", Name: " + name + ", Experience: " + experience + " years, Salary: " + salary + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee1 employee = (Employee1) obj;
        return id == employee.getId();
    }
}

public class EmployeeComp {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1(101, "Parth", 3, 60000);
        Employee1 emp2 = new Employee1(102, "Ravi", 5, 75000);

        System.out.println("Employee 1: " + emp1);
        System.out.println("Employee 2: " + emp2);

        System.out.println("emp1 equals emp2? " + emp1.equals(emp2)); // false

    }
}
