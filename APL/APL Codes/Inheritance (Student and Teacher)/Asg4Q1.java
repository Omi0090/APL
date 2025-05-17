import java.util.Scanner;

class Person {
    private int id;
    private String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Id: " + this.id + " and Name: " + this.name;
    }
}

class Teacher extends Person {
    private int salary;

    Teacher(int id, String name, int salary) {
        super(id, name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + " and Salary: " + this.salary;
    }
}

class Student extends Person {
    private int fees;

    Student(int id, String name, int fees) {
        super(id, name);
        this.fees = fees;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String toString() {
        return super.toString() + " and Fees: " + this.fees;
    }
}

class Asg4Q1 {
    public static void main(String args[]) {
        // Person p1 = new Person(1, "Parth");
        // System.out.println(p1);

        Scanner sc = new Scanner(System.in);
        Person arr[] = new Person[5];
        int ch;
        int idx = 0;

        while (arr.length <= 5) {
            System.out.println("1. Add Teacher");
            System.out.println("2. Display Teacher");
            System.out.println("3. Add Student");
            System.out.println("4. Display Student");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            // System.out.println("");

            switch (ch) {
                case 1:
                    System.out.print("\nEnter Teacher's id: ");
                    int tId = sc.nextInt();
                    System.out.print("\nEnter Teacher's name: ");
                    String tName = sc.next();
                    System.out.print("\nEnter Teacher's salary: ");
                    int tSalary = sc.nextInt();
                    Teacher t = new Teacher(tId, tName, tSalary);
                    arr[idx++] = t;
                    System.out.println("");
                    break;

                case 2:
                    for (int i = 0; i < idx; i++) {
                        if (arr[i] instanceof Teacher) {
                            System.out.println(arr[i]);
                        }
                    }
                    System.out.println("");
                    break;

                case 3:
                    System.out.print("\nEnter Student's id: ");
                    int sId = sc.nextInt();
                    System.out.print("\nEnter Student's name: ");
                    String sName = sc.next();
                    System.out.print("\nEnter Student's fees: ");
                    int sFees = sc.nextInt();
                    Student s = new Student(sId, sName, sFees);
                    arr[idx++] = s;
                    System.out.println("");
                    break;

                case 4:
                    for (int i = 0; i < idx; i++) {
                        if (arr[i] instanceof Student) {
                            System.out.println(arr[i]);
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                    break;
            }
        }
        sc.close();
    }
}