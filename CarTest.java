package apphw2;
abstract class Car{
	String name;
	int price;
	void printInfo(){System.out.println("차 이름은 "+this.name+"이고 가격은 "+this.price+"입니다.");}
	abstract void printSignature();
}
class Benz extends Car{
	Benz(int price){
		this.name="benz";
		this.price=price;
	}
	void printSignature(){
		System.out.println("벤츠는 길에서 자주 보입니다.");
	}
}
class Bmw extends Car{
	Bmw(int price){
		this.name="BMW";
		this.price=price;
	}
	void printSignature(){
		System.out.println("BMW는 내가 좋아하는 차입니다.");
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
