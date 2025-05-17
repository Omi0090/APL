class Employee1 {
    private final int id;
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

    // Appraisal method to increase salary based on experience
    public void giveAppraisal() {
        double hikePercentage = 0;

        if (experience > 10) {
            hikePercentage = 40;
        } else if (experience > 5) {
            hikePercentage = 20;
        } else if (experience > 3) {
            hikePercentage = 10;
        }

        if (hikePercentage > 0) {
            salary += (salary * hikePercentage) / 100;
            System.out.println(name + " received a " + hikePercentage + "% appraisal. New Salary: " + salary);
        } else {
            System.out.println(name + " is not eligible for appraisal.");
        }
    }

    // Overriding toString() to print Employee details
    @Override
    public String toString() {
        return "Employee { ID: " + id + ", Name: " + name + ", Experience: " + experience + " years, Salary: " + salary + " }";
    }

    // Overriding equals() to perform deep comparison (based on ID)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee1 employee = (Employee1) obj;
        return id == employee.id;
    }
}

public class UppraisalEmployee {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1(101, "Parth", 3, 60000);
        Employee1 emp2 = new Employee1(103, "Aryan", 11, 90000);
        Employee1 emp3 = new Employee1(101, "Parth", 3, 60000); // Same ID as emp1

        // Display employee details before appraisal
        System.out.println("Before Appraisal:");
        System.out.println(emp1);
        System.out.println(emp2);

        // Perform appraisals
        emp1.giveAppraisal();
        emp2.giveAppraisal();

        // Display employee details after appraisal
        System.out.println("\nAfter Appraisal:");
        System.out.println(emp1);
        System.out.println(emp2);

        // Checking equality using equals()
        System.out.println("\nEquality Check:");
        System.out.println("emp1 equals emp4? " + emp1.equals(emp3)); // true (same ID)
    }
}
