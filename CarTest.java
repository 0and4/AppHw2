package apphw2;
abstract class Car{
	String name;
	int price;
	void printInfo(){System.out.println("�� �̸��� "+this.name+"�̰� ������ "+this.price+"�Դϴ�.");}
	abstract void printSignature();
}
class Benz extends Car{
	Benz(int price){
		this.name="benz";
		this.price=price;
	}
	void printSignature(){
		System.out.println("������ �濡�� ���� ���Դϴ�.");
	}
}
class Bmw extends Car{
	Bmw(int price){
		this.name="BMW";
		this.price=price;
	}
	void printSignature(){
		System.out.println("BMW�� ���� �����ϴ� ���Դϴ�.");
	}
}
public class CarTest {
	public static void main(String args[]) {
		Benz benz=new Benz(5000);
		Bmw bmw=new Bmw(4500);
		benz.printInfo();
		bmw.printInfo();
		benz.printSignature();
		bmw.printSignature();
	}
}
