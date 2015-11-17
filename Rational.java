public class Rational{

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
    }
}