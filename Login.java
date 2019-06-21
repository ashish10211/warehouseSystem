import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {
public static void main(String args[] ) throws IOException
{
	System.out.println("_____________________________________\n");
	System.out.println("PLEASE SELECT WHAT KIND OF USER YOU ARE\n  \n [1] CUSTOMER \n [2] MANAGER \n [3] SALES STAFF \n [4] WAREHOUSE");
	System.out.println("_____________________________________");
	Scanner sc=new Scanner(System.in);
	int input=sc.nextInt();
	switch(input)
	{
	case 1:
		System.out.println("===== HELLO CUSTOMER PLEASE PROCEED HERE =====");
		Customer obj=new Customer();
		obj.clogin();
		break;
	case 2:
		System.out.println("===== HELLO MANAGER PLEASE PROCEED HERE =====");
		Manager m=new Manager();
		m.mlogin();
		break;
	case 3:
		System.out.println("===== HELLO SALES STAFF PLEASE PROCEED HERE =====");
		Sales obj2=new Sales();
		obj2.slogin();
		break;
	case 4:
		System.out.println("===== HELLO WAREHOUSE STAFF PLEASE PROCEED HERE =====");
		WarehouseStaff obj3=new WarehouseStaff();
		obj3.wlogin();
		break;
		
	}
}

	
}






	




