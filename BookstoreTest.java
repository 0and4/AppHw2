package apphw2;
import java.util.Scanner;
abstract class Book{
	String name="å�̸�";
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
	public void printInfo() { //� �뵵�� ���� �޼ҵ�����
		String gName = "��ȭå";
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
	public void printInfo() { //� �뵵�� ���� �޼ҵ�����
		String gName = "�Ҽ�";
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
	public void printInfo() { //� �뵵�� ���� �޼ҵ�����
		String gName = "����";
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
			books[i]=new Comic(name,price); //books[i] �ʱ�ȭ�ϴ� ���?
			dP=new double[num];
			gN=new String[num];
		}
	}
	void setBooks() { 
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<books.length;i++) {
			System.out.print("å�̸�: ");
			name=sc.next();
			System.out.print("å ����: ");
			price = sc.nextInt();
			System.out.println("å �帣(1: �ڹ�, 2: �Ҽ�, 3:����): ");
			genre=sc.nextInt();
			if (genre==1) {
				Comic c = new Comic(name,price);
				dPrice=c.priceSale();
				gName="��ȭå";
			}
			else if (genre==2) {
				Fiction f = new Fiction(name,price);
				dPrice=f.priceSale();
				gName="�Ҽ�";
			}
			else if (genre==3) {
				Magazine m = new Magazine(name,price);
				dPrice=m.priceSale();
				gName="����";
			}
			books[i].name=name;
			books[i].price=price;
			dP[i]=dPrice;
			gN[i]=gName;
		}
	}
	void printBooksInfo() {
		for(int i=0;i<books.length;i++) {
			System.out.println("å�� �̸��� "+books[i].name+"�̰� �帣�� "+gN[i]+"�Դϴ�.");
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