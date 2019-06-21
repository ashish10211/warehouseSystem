import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WarehouseStaff {

	ArrayList<Products> arraylist=new ArrayList<Products>();
	Scanner sc=new Scanner(System.in);
	public static List<Custselec> cs;
public void wlogin(){
	System.out.println("Enter username");
	String userInput=sc.next();
	System.out.println("Enter Password");
	String userpassword=sc.next();

	
	if(userInput.equals("ASHISH") && userpassword.equals("ASHISH10211")){
		WarehouseStaff ws=new WarehouseStaff();
		ws.wstock();
	}
	else
	{
		System.out.println("Unauthorised login");
	}
}
public void wstock(){
	Database or=new Database();
	ArrayList<Products> ps=or.getProductList();
	or.prodDisplay();
	System.out.println("___________________________________________________________");
	System.out.println("===== SELECT PRODUCT WHOSE STOCK YOU WANT TO CHECK =====\n");
	int u=sc.nextInt();
	System.out.println("Stock of "+ps.get(u-1).getProductName()+" is "+ps.get(u-1).getStock());
	System.out.println("===== ENTER 1 TO PLACE THIS ITEM IN SHELF =====");
	System.out.println("___________________________________________________________");
	int b=sc.nextInt();
	if(b==1){
	try{
      FileWriter outFile = new FileWriter("C:/Users/ASHISH/Desktop/seff/warehouse.txt");
		BufferedWriter outStream1 = new BufferedWriter(outFile);
       outStream1.write("ITEM PLACED IN SHELF  ");
       outStream1.write(ps.get(u-1).getProductName());
       outStream1.write("    ");
       outStream1.write(String.valueOf(ps.get(u-1).getStock()));
       outStream1.newLine();
       outStream1.close();
		
		}
		
	catch(IOException e){
		System.out.println("SOMETHING WENT WRONG .....PLEASE TRY AGAIN LATER");
	}
	System.out.println("===== ITEM PLACED IN SHELF - CHECK TEXT FILE FOR LOGS =====");
}
}
}
