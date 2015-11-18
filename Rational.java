/*
  Team TheGrimRepo - Sachal Malick, Christopher Sherling
  APCS1 pd5
  HW32 -- Irrationality Stops Here
  2015-11-17
*/


// Phase 1 Complete

public class  Rational{
	 

    private double numerator;
    private double denominator;

    //Default Constructor
    public Rational(){
	numerator = 0;
	denominator = 1;
    }

    //Overloaded Constructor
    public Rational(double newNum, double newDen){
	numerator = newNum;
	denominator = newDen;
    }


    //toString printing x/y form
    public String toString(){
	String num = "";
	num += numerator;
	num += "/";
	num += denominator;
	return num;
    }


    //accesors and mutatorsfor each
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

    //Multiplies numerators then denominators
    public void multiply (Rational r) {
	this.numerator*=r.numerator;
	this.denominator*=r.denominator;
    }
	
    //Divides numerators then denomintors
    public void divide (Rational r) {
	this.numerator/=r.numerator;
	this.denominator/=r.denominator;
    }
	
    //Returns floating point number
    public static double floatValue(Integer s) {
	return (double)s;
    }
	
	
    //Main woohoooooooooooooo #testcalls
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