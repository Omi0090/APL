import java.io.*;

class InvalidTAException extends Exception {
	InvalidTAException(String message) {
		super(message);
	}
}

class InvalidSAException extends Exception {
	InvalidSAException(String message) {
		super(message);
	}
}

class Employee {
	private double salary;
	private String name;
	
	Employee(String name, double salary) {
		this.salary = salary;
		this.name = name;
	}
	
	public void requestTA(double TA) throws InvalidTAException {
        if (TA > 0.15 * salary) {
            throw new InvalidTAException("Travelling allowance cannot be more than 15% of salary.");
        }
		else {
			System.out.println("Travelling allowance granted");
		}
    }

    public void requestSA(double SA) throws InvalidSAException {
        if (SA > 0.20 * salary) {
            throw new InvalidSAException("Staying allowance cannot be more than 20% of salary.");
        }
		else {
			System.out.println("Staying allowance granted");
		}
    }
}

class EmployeeAllowance {
	public static void main(String args[]) {
		Employee emp = new Employee("Parth", 100);
		
		try{
			emp.requestTA(10);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try{
			emp.requestSA(25);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}