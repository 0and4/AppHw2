package apphw2;
import java.util.Scanner;
interface Operator{
	double operate(double num1, double num2);
}
class Add implements Operator{
	public double operate(double num1, double num2) {
		return num1+num2;
	}
}
class Sub implements Operator{
	public double operate(double num1, double num2) {
		return num1-num2;
	}
}
class Mul implements Operator{
	public double operate(double num1, double num2) {
		return num1*num2;
	}
}
class Div implements Operator{
	public double operate(double num1, double num2) {
		return num1/num2;
	}
}
public class CalculatorTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextInt();
		double num2 = sc.nextInt();
		
		Add add = new Add();
		double a = add.operate(num1, num2);
		System.out.println("Add : "+a);
		
		Sub sub= new Sub();
		double s = sub.operate(num1, num2);
		System.out.println("Sub : "+s);
		
		Mul mul= new Mul();
		double m = mul.operate(num1, num2);
		System.out.println("Mul : "+m);
		
		Div div= new Div();
		double d = div.operate(num1, num2);
		System.out.println("Div : "+d);
	}
}