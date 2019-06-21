import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Transcation {

	ArrayList<Products> ps=new ArrayList<Products>();
	Database d=new Database();
	public List<Custselec> cs=new ArrayList<Custselec>();
	int tol;
	public int random(){
	Random rand=new Random();
	int ran=rand.nextInt(40);
	return ran;
	}
	public int fpoints(int tot){
		Database or=new Database();
		int amount=tot;
		int same=amount;
		System.out.println(amount);
		int dis;
		int point =random();
		int finalPoints;
		int npoint=0;
		if(amount>10){
			 npoint=amount/10;
		}
		System.out.println("_______________________________________________________________________");
		System.out.println("\n===== YOU ARE GETTING  "+npoint+" POINTS FOR THIS TRANSCATION =====");
		System.out.println(" ===== AVAILABLE POINTS ARE :"+ point+" =====");
		System.out.println("TOTAL POINTS TO REDEEM "+ (npoint+point));
	    System.out.println("\n Do you want to use Your points for this transcation"
	   		+ "\n"
	   		+ "\n"
	   		+ "*******1) PRESS 1 to REDEMM POINTS*******\n"
	   		+ "\n"
	   		+ "*******2) PRESS 2 to CONTINUE TO PAY*******");
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   System.out.println("_______________________________________________________________________");
	   switch(n){
	   case 1:
		   if((point+npoint) >= 20 || point ==20){
				   dis=(point/20)*5;
					 System.out.println(dis);
					  amount=amount-dis;
			}
		   else{
				System.out.println("Sorry you dont have enought points :- redirecting you to payment");
				}
		   System.out.println("===== NOW THE TOTAL AMOUNT IS ===== "+amount);
		   break;
		   
	   case 2:
		   System.out.println("===== NO DISCOUNT APPLIED ===== AMOUNT IS ===== "+same);
		   break;
	   }
	   System.out.println("_______________________________________________________________________");
	   if(amount==same){
		   return same;
	   }
	   else{
		   return amount;
	   }
	   
	}
  public int offers(int j,int id,List<Custselec> li){
	  int userselc=j;
	  int i=id;
	 int famount = 0;
	 double val=managerDiscount();

	  if(i>=5 && i<10){
		  famount=(int) (li.get(userselc).getProductPrice()*val);
	  }
	  else if(i>=10 && i<20){
		  famount=(int) (li.get(userselc).getProductPrice()*val+0.1);
	  }
	  else
	  {
		  famount=(int) (li.get(userselc).getProductPrice()*val+0.2);
	  }
	  System.out.println(" ");
	 System.out.println("===== PRICE AFTER BULK DISCOUNT IS =====  :  "+famount);
	    return famount;
  }

public double managerDiscount(){
	double abc=0;
	BufferedReader br;
	try {
		br = new BufferedReader(new FileReader("C:/Users/ASHISH/Desktop/DISCOUNT.txt"));
		
	    StringBuilder sb = new StringBuilder();
	    String line = br.readLine();
      if(line == null){
	        abc=0.1;
              }
	    else {
	        double aa=Double.parseDouble(line);
	        abc=aa/100;
	    }
	} catch(IOException e) {
	    System.out.println("SOMETHING WENT WRONG");
	}return abc;
}

}

  
