package apphw2;
import java.util.Scanner;
abstract class Book{
	String name;
	int price;
	Book(String name,int price){
		this.name=name;
		this.price=price;
	}
	abstract void printInfo();
	abstract double salePrice();
}
class Comic extends Book{
	Comic(String name, int price){
		super(name,price);
		}
	public void printInfo() {
		System.out.println("å�� �̸��� "+name+"�̰� �帣�� ��ȭå�Դϴ�.");
	}
	public double salePrice() {
		double result=price*0.9;
		return result;
	}
}
class Fiction extends Book{
	Fiction(String name, int price){
		super(name,price);
		}
	public void printInfo() {
		System.out.println("å�� �̸��� "+name+"�̰� �帣�� �Ҽ��Դϴ�.");
	}
	public double salePrice() {
		double result=price*0.85;
		return result;
	}
}
class Magazine extends Book{
	Magazine(String name, int price){
		super(name,price);
		}
	public void printInfo() {
		System.out.println("å�� �̸��� "+name+"�̰� �帣�� �����Դϴ�.");
	}
	public double salePrice() {
		double result=price*0.95;
		return result;
	}
}
class BookStore{
	Book[] books;
	double[] dP;
	BookStore(int num){
		books = new Book[num];
		dP=new double[num];
	}
	void setBooks() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<books.length;i++) {
			System.out.print("å�̸�: ");
			String name=sc.next();
			System.out.print("å ����: ");
			int price = sc.nextInt();
			System.out.println("å �帣(1: �ڹ�, 2: �Ҽ�, 3:����): ");
			int genre=sc.nextInt();
			if (genre==1) {
				books[i]=new Comic(name,price);
			}
			else if (genre==2) {
				books[i] = new Fiction(name,price);
			}
			else if (genre==3) {
				books[i] = new Magazine(name,price);
			}
			double dPrice=books[i].salePrice();
			dP[i]=dPrice;
		}
	}
	void printBooksInfo() {
		for(int i=0;i<books.length;i++) {
			books[i].printInfo();
			System.out.println("�ǸŰ����� "+dP[i]+"�Դϴ�.");
		}
	}
}
public class BookstoreTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Ĵ� å�� ������?: ");
		int cnt = sc.nextInt();
		BookStore b=new BookStore(cnt);
		b.setBooks();
		b.printBooksInfo();
	}
}