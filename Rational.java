
 public class  Rational{
	 

	    private double numerator;
	    private double denominator;

	    public Rational(){
		numerator = 0;
		denominator = 1;
	    }

	    public Rational(double newNum, double newDen){
		numerator = newNum;
		denominator = newDen;
	    }

	    public String toString(){
		String num = "";
		num += numerator;
		num += "/";
		num += denominator;
		return num;
	    }
	public double getNumerator() {
			return numerator;
		}

		public void setNumerator(double numerator) {
			this.numerator = numerator;
		}

		public double getDenominator() {
			return denominator;
		}

		public void setDenominator(double denominator) {
			this.denominator = denominator;
		}

	public void multiply (Rational r) {
		this.numerator*=r.numerator;
		this.denominator*=r.denominator;
	}
	

	 public void divide (Rational r) {
		this.numerator/=r.numerator;
		this.denominator/=r.denominator;
	}
	
	public static double floatValue(Integer s) {
		return (double)s;
	}
	
	
	
	public static void main(String[] args) {
		
		Rational r = new Rational(3,4);
		Rational j = new Rational(5,6);
		Rational a = new Rational(6,7);
		Rational b = new Rational(7,8);

		System.out.println("numerator is:" + r.numerator + " denominator is:" + r.denominator);
		System.out.println("we are dividing this by " + j.numerator + "/" + j.denominator);
		r.divide(j);
		System.out.println("Now that we divided, numerator is:" + r.numerator + " denominator is:" + r.denominator);
		a.multiply(b);
		System.out.println("Now that we multiplied, numerator is:" + r.numerator + " denominator is:" + r.denominator);
		int shf = 4; 
		System.out.println(floatValue(shf));
		
		/*
		 * output
		 * numerator is:3.0 denominator is:4.0
			we are dividing this by 5.0/6.0
			Now that we divided, numerator is:0.6 denominator is:0.6666666666666666
			Now that we multiplied, numerator is:0.6 denominator is:0.6666666666666666
			4.0
		 */
		
	}

}