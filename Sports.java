import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sports {
	public static void main(String[] args){

}
 public List<Custselec> getCs() {
		return cs;
	}
	public void setCs(List<Custselec> cs) {
		this.cs = cs;
	}
ArrayList<String> iname=new ArrayList<String>();    
 public List<Custselec> cs=new ArrayList<Custselec>();

	public static Database or=new Database();
	public int total;
	Scanner sc=new Scanner(System.in);
	public void sportsitem(){
		System.out.println("_______________________________________________________");
		System.out.println("******** LIST OF SPORTS ******** ");
		System.out.println("\n [1] CRICKET \n [2] AUSTRALIAN FOOTBALL "
				+ "\n [3] SWIMMING \n [4]  NETBALL \n [5]  HOCKEY\n");
	    System.out.println(" *****PLEASE SELECT THE SPORTS ***** ");
	    System.out.println("_______________________________________________________");
		int choice=sc.nextInt();
		ArrayList<Products> ps=or.getProductList();
		switch(choice){
		case 1:
			System.out.println("\n ***** You selected Cricket :- now you can choose items you want*****");
		
		    or.cricDisplay();
					method();
	         break;
		case 2:
			System.out.println("\n ********You selected Australian Rules Football :- now you can choose items you want********");
		    or.footDisplay();
		    method();
			break;
		case 3:
			System.out.println("\n ********You selected Swimming :- now you can choose items you want*******");
			or.swimDisplay();
			method();
			break;
		case 4:
			System.out.println("\n ********You selected Netball :- now you can choose items you want********");
			or.netDisplay();
			method();
			break;
		case 5:
			System.out.println("\n ********You selected Hockey :- now you can choose items you want********");
			or.hockeyDisplay();
			method();
			break;
		}
	}
	public void method(){
		ArrayList<Products> ps=or.getProductList();
		System.out.println("\n ***** SELECT THE PRODUCT YOU WANT *****");
		int us=sc.nextInt();
	    System.out.println(" choice is "+ps.get(us-1).getProductName());
	    
	String g=ps.get(us-1).getProductName().toString() ;

		System.out.println("\n ***** ENTER THE QUANTITY OF PRODUCT *****");
		int qt=sc.nextInt();
		int price1=ps.get(us-1).getProductPrice();
		or.looptime(us,g,qt,price1);
		
		if(ps.get(us-1).pstock>qt){
			
			for(int j=0;j<2;j++){
				iname.add(j,ps.get(us-1).getProductName());
			}
			
			System.out.println("_______________________________________________________");
			ps.get(us-1).pstock=ps.get(us-1).pstock-qt;
			System.out.println("\n ========= STOCK AVAILABLE IS  "+ps.get(us-1).pstock+" ==========");
			System.out.println("\n ========== [1] CLICK 1 TO CONTINUE HERE ==========");
			System.out.println("\n ========== [2] CLICK 2 TO SEE PRODUCT ADDED ==========");
			System.out.println("\n ========= [3] CLICK 3 TO SEE DISCOUNT APPLIED ==========");
			System.out.println("\n ========== [4] CLICK 4 TO PROCEED TO TRANSCATION =========");
			System.out.println("_______________________________________________________");
			int num=sc.nextInt();
			
			if(num==1){
				sportsitem();	
			}
			
			else if(num==2){
				or.reciept();
																						
			}
			
			else  if(num==3){
				or.getDiscount();
			}
			else if(num==4){
				or.checkout();
			}
			
		}
		else{
			System.out.println("\n *****Not enough stock . Try again later*****");
		}
	}
	

}

