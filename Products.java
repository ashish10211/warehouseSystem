import java.util.ArrayList;
import java.util.Scanner;

public class Products {
	String pname;
	int pprice;
	int pid;
	int pstock;
	String sportsType;
    
public Products(String cname, int cprice, int cid ,String csportsType,int stock) {
	// TODO Auto-generated constructor stub
	pname=cname;
	pprice=cprice;
	pid=cid;
	sportsType=csportsType;
	pstock=stock;
}
Scanner sc=new Scanner(System.in);

	public String getProductName(){
		return this.pname;
		
	}
	public int getProductID(){
		return this.pid;
	}
	public int getProductPrice(){
		return this.pprice;
	}
	public int getStock(){
		return this.pstock;
	}
	public void setProductPrice(int price){
		this.pprice=price;
	}
	public void setStock(int number){
		this.pstock=pstock+number;
	}
	
}
