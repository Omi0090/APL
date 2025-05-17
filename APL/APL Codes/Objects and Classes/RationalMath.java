class Rational {
	private int n;
	private int d;
	
	Rational(){
		n = d = 1;
	}
	
	Rational(int n, int d) {
		this.n = n;
		this.d = d;
	}
	
	private int gcd(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	private Rational reduce(Rational temp) {
		int reducer = gcd(temp.n, temp.d);
		temp.n /= reducer;
		temp.d /= reducer;
		return temp;
	}
	
	void setNum(int n) {
		this.n = n;
	}
	void setDen(int d) {
		this.d = d;
	}
	
	int getNum() {
		return n;
	}
	int getDen() {
		return d;
	}
	
	public String toString(){
		return n+"/"+d;
	}	
	
	public Rational add(Rational r) {
		Rational temp = new Rational();
		temp.n = this.n * r.d + r.n * this.d;
		temp.d = this.d * r.d;
		temp = reduce(temp);
		return temp;
	}
	
	public Rational subtract(Rational r) {
		Rational temp = new Rational();
		temp.n = this.n * r.d - r.n * this.d;
		temp.d = this.d * r.d;
		temp = reduce(temp);
		return temp;
	}
	
	public Rational multiply(Rational r) {
		Rational temp = new Rational();
		temp.n = this.n * r.n;
		temp.d = this.d * r.d;
		temp = reduce(temp);
		return temp;
	}
	
	public Rational divide(Rational r) {
		Rational temp = new Rational();
		temp.n = this.n * r.d ;
		temp.d = this.d * r.n;
		temp = reduce(temp);
		return temp;
	}
}

class RationalMath {
	public static void main(String args[]) {
		Rational r1 = new Rational(1,2);
		Rational r2 = new Rational(3,4);
		
		Rational r3 = new Rational();
		
		System.out.println("Rational 1: "+ r1);
		System.out.println("Rational 2: "+ r2);
		
		r3 = r1.add(r2);
		System.out.println("Addition is: "+r3);
		r3 = r1.subtract(r2);
		System.out.println("Subtraction is: "+r3);
		r3 = r1.multiply(r2);
		System.out.println("Multiplication is: "+r3);
		r3 = r1.divide(r2);
		System.out.println("Division is: "+r3);
	}
}