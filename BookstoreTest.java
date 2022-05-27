package apphw2;
import java.util.Scanner;
abstract class Book{
	String name="책이름";
	int price=0;
	Book(String name,int price){
		this.name=name;
		this.price=price;
	}
	abstract void printInfo();
	abstract double salePrice();
}
class Comic extends Book{
	double sale,result;
	Comic(String name, int price){
		super("",0);
		this.name=name;
		this.price=price;
		}
	public void printInfo() { //어떤 용도로 쓰는 메소드인지
		String gName = "만화책";
	}
	public double salePrice() {
		this.sale=0.9;
		return sale;
	}
	double priceSale() {
		result=price*salePrice();
		return result;
	}
}
class Fiction extends Book{
	double sale,result;
	Fiction(String name, int price){
		super("",0);
		this.name=name;
		this.price=price;
		}
	public void printInfo() { //어떤 용도로 쓰는 메소드인지
		String gName = "소설";
	}
	public double salePrice() {
		this.sale=0.85;
		return sale;
	}
	double priceSale() {
		result=price*salePrice();
		return result;
	}
}
class Magazine extends Book{
	double sale,result;
	Magazine(String name, int price){
		super("",0);
		this.name=name;
		this.price=price;
		}
	public void printInfo() { //어떤 용도로 쓰는 메소드인지
		String gName = "잡지";
	}
	public double salePrice() {
		this.sale=0.95;
		return sale;
	}
	double priceSale() {
		result=price*salePrice();
		return result;
	}
}
class BookStore{
	Book[] books;
	String name,gName;
	double dPrice;
	double[] dP;
	int price,genre;
	String[] gN;
	BookStore(int num){
		books = new Book[num];
		for(int i=0;i<num;i++) {
			books[i]=new Comic(name,price); //books[i] 초기화하는 방법?
			dP=new double[num];
			gN=new String[num];
		}
	}
	void setBooks() { 
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<books.length;i++) {
			System.out.print("책이름: ");
			name=sc.next();
			System.out.print("책 가격: ");
			price = sc.nextInt();
			System.out.println("책 장르(1: 코믹, 2: 소설, 3:잡지): ");
			genre=sc.nextInt();
			if (genre==1) {
				Comic c = new Comic(name,price);
				dPrice=c.priceSale();
				gName="만화책";
			}
			else if (genre==2) {
				Fiction f = new Fiction(name,price);
				dPrice=f.priceSale();
				gName="소설";
			}
			else if (genre==3) {
				Magazine m = new Magazine(name,price);
				dPrice=m.priceSale();
				gName="잡지";
			}
			books[i].name=name;
			books[i].price=price;
			dP[i]=dPrice;
			gN[i]=gName;
		}
	}
	void printBooksInfo() {
		for(int i=0;i<books.length;i++) {
			System.out.println("책의 이름은 "+books[i].name+"이고 장르는 "+gN[i]+"입니다.");
			System.out.println("판매가격은 "+dP[i]+"입니다.");
		}
	}
}
public class BookstoreTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("서점에서 파는 책의 개수는?: ");
		int cnt = sc.nextInt();
		BookStore b=new BookStore(cnt);
		b.setBooks();
		b.printBooksInfo();
	}
}