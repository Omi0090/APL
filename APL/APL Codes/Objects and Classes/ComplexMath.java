class Complex {
	private int real;
	private int img;
	
	Complex(){
		real = img = 0;
	}
	
	Complex(int real, int img) {
		this.real = real;
		this.img = img;
	}
	
	void setReal(int real) {
		this.real = real;
	}
	void setImg(int img) {
		this.img = img;
	}
	
	int getReal() {
		return real;
	}
	int getImg() {
		return img;
	}
	
	public String toString(){
		if(img < 0) {
			return real+"-"+img*-1+"i";
		}
		else {
			return real+"+"+img+"i";
		}
	}	
	
	public Complex add(Complex c) {
		Complex temp = new Complex();
		temp.real = this.real + c.real;
		temp.img = this.img + c.img;
		return temp;
	}
	
	public Complex subtract(Complex c) {
		Complex temp = new Complex();
		temp.real = this.real - c.real;
		temp.img = this.img - c.img;
		return temp;
	}
}
class ComplexMath {
	public static void main(String args[]) {
		Complex c1 = new Complex(1,2);
		Complex c2 = new Complex(3,4);
		
		System.out.println("Complex 1: "+ c1);
		System.out.println("Complex 2: "+ c2);
		
		Complex c3 = c1.add(c2);
		System.out.println("Addition is: "+c3);
		c3 = c1.subtract(c2);
		System.out.println("Subtraction is: "+c3);
	}
}