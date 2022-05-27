package apphw2;
abstract class Car{
	String name;
	int price;
	void printInfo(){System.out.println("name:"+name+" price:"+price);}
	abstract void printSignature();
}
class Benz extends Car{
	Benz(int price){
		this.name="benz";
		this.price=price;
	}
	void printSignature(){
		System.out.println(name+" Signature");
	}
}
class Bmw extends Car{
	Bmw(int price){
		this.name="BMW";
		this.price=price;
	}
	void printSignature(){
		System.out.println(name+" Signature");
	}
}
public class CarTest {
	public static void main(String args[]) {
		Benz b1=new Benz(58000000);
		b1.printInfo();
		b1.printSignature();
		
		Bmw b2=new Bmw(64000000);
		b2.printInfo();
		b2.printSignature();
	}
}
