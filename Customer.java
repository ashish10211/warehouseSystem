import java.util.Scanner;

public class Customer {
	Scanner sc=new Scanner(System.in);
		public void clogin(){
			System.out.println("Enter username");
		
			String userInput=sc.next();
			System.out.println("Enter Password");
			String userpassword=sc.next();
			
			if(userInput.equals("ASHISH") && userpassword.equals("ASHISH10211")){
		method();
			}
			else if(userInput.equals("SEBY") && userpassword.equals("TOM")){
				Sports a=new Sports();
				a.sportsitem();
				
			}
			else if(userInput.equals("VINEETH") && userpassword.equals("vineeth15"))
			{
				Sports a=new Sports();
				a.sportsitem();
				
			}
			else{
				System.out.println("You are not authorised person");
			}
			
			
		
		}
		public void choice(){
			
			System.out.println("Enter the quantity of product");
			int qt=sc.nextInt();
		}
		public void method(){
			System.out.println("_____________________________________");
			System.out.println("===== SELECT WHAT YOU WANT TO DO ===== \n"
					+ "PRESS 1 TO SEARCH PRODUCT BY ID \n"
					+ "PRESS 2 TO SEARCH PRODUCT NY NAME \n"
					+ "PRESS ANY OTHER NUMBER TO SELECT PRODUCTS \n");
			System.out.println("_____________________________________");
			int us=sc.nextInt();
			Database or=new Database();
			if(us==1){
				
				or.searchId();
			}
			else if(us==2){
				or.searchName();
			}
			else{
				Sports a=new Sports();
				a.sportsitem();
			}
			
		}
}
