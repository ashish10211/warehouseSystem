
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Database {
	public static void main(String[] args){
	}
	
	public static List<Custselec> cs;
	public static int ab;
	public static int transID=1;
	public static int totalsum = 0;
	public static HashMap<Integer,Custselec> map=new HashMap<Integer,Custselec>();
	ArrayList<Products> arraylist=new ArrayList<Products>();
	public ArrayList<Database> arraylist2=new ArrayList<Database>();
	String dname;
	int dprice;
	int dtotal;
	int did;
	int disc= 0;
	int qunatityy =0;
	int i =0;
	public Sports sp=new Sports();
	ArrayList<Customer> arraylist1=new ArrayList<Customer>();
ArrayList<Supplier> arraylist3=new ArrayList<Supplier>();
   Scanner sc=new Scanner(System.in);
   
	public ArrayList<Products> getProductList(){
		
		Products cricketbat=new Products("cricket bat",15,1,"cric",10);
		Products cricketball=new Products("cricket ball",10,2,"cric",8);
		Products CricketWickets=new Products("cricket wickets",20,3,"cric",8);
		Products CricketKneePads=new Products("cricket kneepads",18,4,"cric",9);
		Products CricketGloves=new Products("cricket gloves",17,5,"cric",7);
		Products football=new Products("football",17,6,"arf",11);
		Products footshoe=new Products("footshoe",25,7,"arf",17);
		Products footjersy=new Products("footjersy",22,8,"arf",18);
		Products footstockings =new Products("foot stockings",13,9,"arf",19);
		Products footGloves =new Products("foot gloves",35,10,"arf",12);
		Products swimmingsuit =new Products("swim suit",25,11,"swim",21);
		Products swimminggoggles =new Products("swim goggles",17,12,"swim",25);
		Products swimmingpads =new Products("swimpads",27,13,"swim",24);
		Products swimmingcap =new Products("swimcap",18,14,"swim",27);
		Products swimmingwatch =new Products("swimwatch",50,15,"swim",30);
		Products netballshorts =new Products("netshorts",25,16,"net",24);
		Products netballjersy =new Products("netjersy",29,17,"net",26);
		Products netballshoe =new Products("netshoe",20,18,"net",25);
		Products netballgoggles =new Products("netgoggles",20,19,"net",27);
		Products netballcap =new Products("netcap",25,20,"net",25);
		Products hockeystick =new Products("hockeystick",25,21,"hockey",13);
		Products hockeyball =new Products("hockeyball",28,22,"hockey",12);
		Products hockeyshoe =new Products("hockeyshoe",14,23,"hockey",9);
		Products hockeygloves =new Products("hockeygloves",33,24,"hockey",20);
		Products hockeyjersy =new Products("hockeyjersy",37,25,"hockey",12);

	
		arraylist.add(cricketbat);
		arraylist.add(cricketball);
		arraylist.add(CricketWickets);
		arraylist.add(CricketKneePads);
		arraylist.add(CricketGloves);
		arraylist.add(football);
		arraylist.add(footshoe);
		arraylist.add(footjersy);
		arraylist.add(footstockings);
		arraylist.add(footGloves);
		arraylist.add(swimmingsuit);
		arraylist.add(swimminggoggles);
		arraylist.add(swimmingpads);
		arraylist.add(swimmingcap);
		arraylist.add(swimmingwatch);
		arraylist.add(netballshoe);
		arraylist.add(netballshorts);
		arraylist.add(netballjersy);
		arraylist.add(netballgoggles);
		arraylist.add(netballcap);
		arraylist.add(hockeystick);
		arraylist.add(hockeyball);
		arraylist.add(hockeyshoe);
		arraylist.add(hockeygloves);
		arraylist.add(hockeyjersy);
		
	     return arraylist;
		
	}
	
	public void prodDisplay() {
		for(int i=0;i<arraylist.size();i++){
			System.out.print(i+1+"] ");
		System.out.println(arraylist.get(i).getProductName()+" :: $"+arraylist.get(i).getProductPrice());	
		}
	} 
	public void cricDisplay(){
		for(int i=0;i<5;i++){
			System.out.print(i+1+"] ");
		System.out.println(arraylist.get(i).getProductName()+" :: $"+arraylist.get(i).getProductPrice());	
		}
	}
	public void footDisplay(){
		for(int i=5;i<10;i++){
			System.out.print(i+1+"]  ");
		System.out.println(arraylist.get(i).getProductName()+" :: $"+arraylist.get(i).getProductPrice());	
		}
	}
	public void swimDisplay(){
		for(int i=10;i<15;i++){
			System.out.print(i+1+"]  ");
		System.out.println(arraylist.get(i).getProductName()+" :: $"+arraylist.get(i).getProductPrice());	
		}
	}
	public void netDisplay(){
		for(int i=15;i<20;i++){
		System.out.print(i+1+"]  ");
		System.out.println(arraylist.get(i).getProductName()+" :: $"+arraylist.get(i).getProductPrice());	
		}
	}
	public void hockeyDisplay(){
		for(int i=20;i<24;i++){
		System.out.print(i+1+"] ");
		System.out.println(arraylist.get(i).getProductName()+" :: $"+arraylist.get(i).getProductPrice());	
		}
	}

public ArrayList<Supplier> getSupplierList(){
	Supplier Kookaburra =new Supplier("Kookaburra","Joseph","8129704723","China","1");                 
	Supplier AdidasIncurza =new Supplier("AdidasIncurza","John","8129712334","Sri Lanka","2");
	Supplier GrayNicollsViper =new Supplier("GrayNicollsViper","Jacob","1234567890","Pakistan","3");
	Supplier MooreIcon =new Supplier("MooreIcon","Jhoney","9876544321","South Africa","4");
	Supplier GMIcon =new Supplier("KookabGMIconurra","Arya","8129704723","America","5");
	Supplier mrf =new Supplier("mrf","Joseph","6543789765","Southamerica","6");
	Supplier nike =new Supplier("nike","seby","3142536475","Africa","7");
	Supplier wildcraft =new Supplier("wildcraft","seby","3142536475","India","8");
	Supplier IBM =new Supplier("IBM","Swati","9873458762","Australia","9");
	Supplier Speridian =new Supplier("Speridian","Riya","9871234569","India","10");

    arraylist3.add(Kookaburra);
	arraylist3.add(AdidasIncurza);
	arraylist3.add(GrayNicollsViper);
	arraylist3.add(MooreIcon);
	arraylist3.add(GMIcon);
	arraylist3.add(mrf);
	arraylist3.add(nike);
	arraylist3.add(wildcraft);
	arraylist3.add(IBM);
	arraylist3.add(Speridian);

	return arraylist3;
	
}
public void supplierDisplay(){
	for(int i=0;i<arraylist3.size();i++){
		System.out.print(i+1+" ");
		System.out.print("Name of Supplier is ");
		System.out.println(arraylist3.get(i).getName());
		System.out.print("Mobile no is ");
		System.out.println(arraylist3.get(i).getMobno());
		System.out.println("\n");
	}
		
	
}
Customer cc=new Customer();

public void searchId(){
	Database or=new Database();
	ArrayList<Products> ps=or.getProductList();
	System.out.println("Enter id of product");
	int u=sc.nextInt();

	for (Products id: ps) {
		if(i==u){
			int ids=ps.get(i-1).getProductID();
			String proname = ps.get(i-1).getProductName();
			System.out.println("The Product Id:"+ids + "      " +"The Product Name is:"+ proname);
			break;
		}
		i++;
	}
	System.out.println("***** PRESS 1 TO GO BACK *****");
	int n=sc.nextInt();
	if(n==1){
		cc.method();
	}
}
public void searchName(){
	Database or=new Database();
	ArrayList<Products> arraylist=or.getProductList();
	int flag =0;
	System.out.println("Enter Name of product");
	String na=sc.nextLine();
	String ds;
	

	for(int i=0;i<5;i++){
		if((na).equals(arraylist.get(i).getProductName().toString())){
			System.out.println("Product found is "+ arraylist.get(i).getProductName().toString());
			flag=1;
			break;
		}
		else{
			flag =0;	
		    }
		
	}
	if(flag==1)
	{
	
	}
	else{
		System.out.println("Item Not Found, Please try again");
	}
	System.out.println("***** PRESS 1 TO GO BACK *****");
	int n=sc.nextInt();
	if(n==1){
		cc.method();
	}
}
public void managerOrder(){
	System.out.println("===== SELECT PRODUCT YOU WANT TO RE-ORDER =====");
	int a=sc.nextInt();
	try{
	FileWriter outFile = new FileWriter("C:/Users/ASHISH/Desktop/seff/REORDER.txt",true);
    BufferedWriter outStream = new BufferedWriter(outFile);
	for(i=0;i<arraylist.size();i++){
		if(i==a){
			System.out.println("***** YOU SELECTED "+arraylist.get(a).getProductName()+" *****");
			System.out.println("===== ENTER QUANTITY =====");
			int qt=sc.nextInt();
			arraylist.get(a).setStock(qt);
			  outStream.write(arraylist.get(a).getProductName()); 
	            outStream.write(" --------- ");
	            outStream.write(String.valueOf(qt));
	            outStream.write("\n");
	            outStream.close();
			System.out.println(" ===== ORDERING IS COMPLETED =====");
		}
			}
	}
			catch(IOException e){
				System.out.println("SOMETHING WENT WRONG .....PLEASE TRY AGAIN LATER");
			}
		
}
		
	
ArrayList<Database> disc1=new ArrayList<Database>();
public void mDiscount(){
	System.out.println("===== HOW MUCH DISCOUNT YOU WANT TO GIVE =====");
	
	
}

public void looptime(int selection,String productname,int qunat,int prices){
	Database or=new Database();
	ArrayList<Products> ps=or.getProductList();
	int numm=selection-1;
	
	int q=qunat;
	int pric=prices;
	for (Products strng: ps) {
		if(i==numm){
			String gg=strng.getProductName().toString() ;
			Custselec string= new Custselec(gg, q,pric,0);
			cs=sp.getCs();
			cs.add(string);
			map.put(transID, string);
			for (int ID : map.keySet()) {
				System.out.println(ID);
				Custselec yo=map.get(ID);
				System.out.println(yo.getSelecProd());
			}
			transID++;
			break;
		}
		i++;
	}
}

public static List<Custselec> getCs() {
	return cs;
}

public static void setCs(List<Custselec> cs) {
	Database.cs = cs;
}

public int reciept()
{
	Database or=new Database();
	ArrayList<Products> ps=or.getProductList();
	Transcation ts=new Transcation();
	int sum=0;
	int i=0;
	int val1 = 0;
	int userselec1 =0;
	for( i=0;i<cs.size();i++)
	{

		int numberofqunat = cs.get(i).getselecquant();	
		System.out.println("_____________________________________");
		System.out.print("The Item "+(i+1)+": "+ cs.get(i).getSelecProd()+ "    ");
		System.out.print("Quantity: "+numberofqunat+" " );
		System.out.print("Price: "+ cs.get(i).getProductPrice()+ "  " );
		
		if(numberofqunat>=5){
			userselec1=i;
			
		 disc=ts.offers(userselec1,numberofqunat,cs);
		 
		 val1= (numberofqunat * cs.get(userselec1).getProductPrice()) - disc;
			}
			else{
				val1= numberofqunat * cs.get(userselec1).getProductPrice();
			}
		System.out.println("");	
		sum=sum+val1;
	}
	
	System.out.println("_____________________________________");
	System.out.println("The total payment is : "+sum );
	ab=ts.fpoints(sum);
	return sum;
}
 public int total(){
	 Database or=new Database();
		ArrayList<Products> ps=or.getProductList();
		
		int sum=0;
		for(int i=0;i<cs.size();i++)
		{
			int val1= cs.get(i).getselecquant() * ps.get(i).getProductPrice();
			sum=sum+val1;
		}
		return sum;
 }
 public void checkout(){
	 Database or=new Database();
		ArrayList<Products> ps=or.getProductList();
		Transcation ts=new Transcation();
		int sum=0;
		int i=0;
		int val1 = 0;
		int userselec1 =0;
		for( i=0;i<cs.size();i++)
		{
			int numberofqunat = cs.get(i).getselecquant();
			if(numberofqunat>=5){
				userselec1=i;
				
			 disc=ts.offers(userselec1,numberofqunat,cs);
			 
			 val1= (numberofqunat * cs.get(userselec1).getProductPrice()) - disc;
				}
				else{
					val1= numberofqunat * cs.get(userselec1).getProductPrice();
				}
			System.out.println("");
			sum=sum+val1;
		}
		ab=ts.fpoints(sum);
		for( i=0;i<cs.size();i++)
		{
			System.out.println("________________________________________________");
			System.out.println(" Item           Quantity  ");
			System.out.println("\nItem "+ (i+1) + ": "+ cs.get(i).getSelecProd());
			System.out.print("\nQuantity : "+ cs.get(i).getselecquant());
			System.out.print("\nPrice : "+ (cs.get(i).getProductPrice()));
		}
		System.out.println("*********************************************************");
		System.out.println("TOTAL AMOUNT TO BE PAID IS "+ab);
		
		try{
		FileWriter outFile = new FileWriter("C:/Users/ASHISH/Desktop/seff/SEF.txt",true);
        BufferedWriter outStream = new BufferedWriter(outFile);
        for( i=0;i<cs.size();i++){
            outStream.write(cs.get(i).getSelecProd()); 
            outStream.write(":: ");
            outStream.write(String.valueOf(cs.get(i).getselecquant()));
            outStream.newLine();
        }
        outStream.write(" ===== ");
        outStream.write("Total amount is "+ab);
        outStream.newLine();
        outStream.close();
		}
		catch(IOException e){
			System.out.println("SOMETHING WENT WRONG .....PLEASE TRY AGAIN LATER");
		}
		try{
			 int ran=random();
			for(int k=0;k<20;k++){
				if(ran == k){
					random();
				}
			
			else{
			FileWriter outFile = new FileWriter("C:/Users/ASHISH/Desktop/sef/"+ran+".txt");
			}
	       FileWriter outFile = new FileWriter("C:/Users/ASHISH/Desktop/sef/"+ran+".txt");
			BufferedWriter outStream1 = new BufferedWriter(outFile);
	        for( i=0;i<cs.size();i++){
	            outStream1.write(cs.get(i).getSelecProd()); 
	            outStream1.write(":: ");
	            outStream1.write(String.valueOf(cs.get(i).getselecquant()));
	            outStream1.newLine();
	        }
	        outStream1.write(" ===== ");
	        outStream1.write("Total amount is "+ab);
	        outStream1.newLine();
	        outStream1.close();
			
			}
			
		}
		catch(IOException e){
			System.out.println("SOMETHING WENT WRONG .....PLEASE TRY AGAIN LATER");
		}
 }

public int getTotalsum() {
	return totalsum;
}
public void getDiscount(){
	double discount=0;
	Transcation ts=new Transcation();
	double val=ts.managerDiscount();
	for(int i=0;i<cs.size();i++){
		if(cs.get(i).getselecquant() > 5 && cs.get(i).getselecquant() < 10){
			System.out.println("====== YOU GOT "+val+" % DISCOUNT ====="+" ON "+cs.get(i).getSelecProd());
		}
		else if(cs.get(i).getselecquant() > 10 && cs.get(i).getselecquant()<15){
			System.out.println("====== YOU GOT "+(val+0.1)+" % DISCOUNT ====="+" ON "+cs.get(i).getSelecProd());
		}
		else if(cs.get(i).getselecquant() > 15 && cs.get(i).getselecquant()< 20){
			System.out.println("====== YOU GOT "+(val+0.2)+" % DISCOUNT ====="+" ON "+cs.get(i).getSelecProd());
		}
	}
	System.out.println("===== PRESS ANY KEY TO RETURN BACK =====");
	int input=sc.nextInt();
	if(input == 1){
		cc.method();
	}

}
public int random(){
	Random rand=new Random();
	int files=rand.nextInt(20)+1;
	return files;
}

}




