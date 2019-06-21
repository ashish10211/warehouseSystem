import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	
	public static void main(String [] args){
	}
	Scanner sc=new Scanner(System.in);
	
	public void mlogin(){
		Manager m=new Manager();
		System.out.println("Enter username");
		Scanner sc=new Scanner(System.in);
		String userInput=sc.next();
		System.out.println("Enter Password");
		String userpassword=sc.next();
		
		if(userInput.equals("ASHISH") && userpassword.equals("ASHISH10211")){
			
			m.mdisplay();
			
		}
		else
		{
			System.out.println("SORRY WRONG USERNAME AND PASSWORD");
		}
	}
	Database or=new Database();
	ArrayList<Products> ps=or.getProductList();
		
	
	public void mdisplay(){
		Manager mn=new Manager();
		System.out.println(" ====== ENTER WHAT YOU WANT TO DO =====");
		System.out.println("___________________________________________\n");
		System.out.print("|");
		System.out.println("[1] UNIT PRICE");
		System.out.print("|");
		System.out.println("[2] STOCK LEVEL");
		System.out.print("|");
		System.out.println("[3] RE-ORDER");
		System.out.print("|");
		System.out.println("[4] SALES REPORT");
		System.out.print("|");
		System.out.println("[5] SUPPLIER DETAILS");
		System.out.print("|");
		System.out.println("[6] OFFER DISCOUNT");
		System.out.print("|");
		System.out.println("[7] AUTOMATIC STOCK UPDATE");
		System.out.print("");
		System.out.println("____________________________________________");
	
	int input=sc.nextInt();
	switch(input){
	case 1:
	   or.prodDisplay();
	  // or.changePrice();
		mn.changePrice();
		
	break;
	case 2:
		or.prodDisplay();
		mn.stockdisplay();
		break;
	case 3:
		or.prodDisplay();
		or.managerOrder();
		break;
	case 4:
		System.out.println("===== PRESS 1 TO SEE THE SALES REPORT =====");
         int a=sc.nextInt();
          if(a==1){
        	  System.out.println("_________________________________\n");
		 BufferedReader br = null;

	        try {

	            String sCurrentLine;

	            br = new BufferedReader(new FileReader("C:/Users/ASHISH/Desktop/seff/SEF.txt"));

	            while ((sCurrentLine = br.readLine()) != null) {
	                System.out.println(sCurrentLine);
	            }
	            System.out.println("_________________________________\n");

	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (br != null)br.close();
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        }}
          else{
        	  
          }
		break;
	case 5:
		System.out.println("===== PRESS 1 TO SEE SUPPLIER DETAILS =====");
		int s=sc.nextInt();
		if(s==1){
			 System.out.println("_________________________________\n");
			or.getSupplierList();
			or.supplierDisplay();
			 System.out.println("_________________________________\n");
		}
		else{
			System.out.println("Supplier list not found");
		}
		break;
	case 6:

		try{
		FileWriter outFile = new FileWriter("C:/Users/ASHISH/Desktop/DISCOUNT.txt");
        BufferedWriter outStream = new BufferedWriter(outFile);
        System.out.println("===== SELECT DISCOUNT YOU WANT TO GIVE =====");
        int di=sc.nextInt();
        outStream.write(String.valueOf(di));
        outStream.close();
		}
		catch(IOException e){
			System.out.println("SOMETHING WENT WRONG .....PLEASE TRY AGAIN LATER");
		}
		break;
	case 7:
		or.prodDisplay();
		mn.aOrder();
		break;
	}

	System.out.println("\n======== CLICK 0 TO CONTINUE HERE ======== ");
	System.out.println("\n======== CLICK 1 TO GO BACK TO SELECTION ======== ");
	System.out.println("\n ======== CLICK 2 TO EXIT ========");
	int us=sc.nextInt();
	if(us==0){
		mn.stockdisplay();
	}
	else if(us==1){
		mn.mdisplay();
	}
	else{
		//exit();
	}
	}
	public void stockdisplay(){
	
		System.out.println("***** SELECT THE PRODUCT YOU WANT STOCK OF *****");
		int u=sc.nextInt();
		 System.out.println("_________________________________\n");
		System.out.println("STOCK OF "+ps.get(u-1).getProductName()+" IS "+ps.get(u-1).getStock());
		 System.out.println("_________________________________\n");
	}
	
	public void changePrice(){
		int i;
		System.out.println("***** SELECT THE PRODUCT WHOSE PRICE YOU WANT TO UPDATE *****\n");
		int us=sc.nextInt();
		 System.out.println("_________________________________\n");
        System.out.println("CURRENT PRICE OF  "+ps.get(us-1).getProductName()+" IS "+ps.get(us-1).getProductPrice());
		System.out.println("ENTER THE PRICE YOU WANT");
		int pr=sc.nextInt();
		ps.get(us-1).setProductPrice(pr);
		for(i=0;i<ps.size();i++){
			if(ps.get(i).pname.equals(ps.get(us-1).getProductName())){
			//ps.set(i,pr);
			}
		}
		System.out.println("UPDATES PRICE OF  "+ps.get(us-1).getProductName()+" IS "+ps.get(us-1).getProductPrice());
		 System.out.println("_________________________________\n");
	}
	
	
	public void aOrder(){
		System.out.println("***** SELECT THE PRODUCT WHOSE STOCK YOU WANT TO UPDATE *****");
		int n=sc.nextInt();
		 System.out.println("_________________________________\n");
		System.out.println("CURRENT STOCK OF"+ps.get(n-1).getProductName()+" IS "+ps.get(n-1).getStock());
		System.out.println("***** PRESS 1 TO AUTOMATIC UPDATE THE STOCK *****");
		int u=sc.nextInt();
		ps.get(u-1).setStock(10);
		System.out.println("UPDATED STOCK OF"+ps.get(n-1).getProductName()+" IS "+ps.get(n-1).getStock());
		 System.out.println("_________________________________\n");
	}
}
