import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sales {
	public void slogin() throws IOException{
		System.out.println("Enter username");
		Scanner sc=new Scanner(System.in);
		String userInput=sc.next();
		System.out.println("Enter Password");
		String userpassword=sc.next();
		
		if(userInput.equals("ASHISH") && userpassword.equals("ASHISH10211")){
			
			
			System.out.println("========= HERE IS THE LIST OF TRANSCATIONS =====");
			
			 File folder = new File("C:/Users/ASHISH/Desktop/sef");
			 File[] listOfFiles = folder.listFiles();
			 System.out.println("_________________________________\n");
			int flag=0;
			 for (File file : listOfFiles) {
				 FileReader read=new FileReader(file);
				 BufferedReader br=new BufferedReader(read);
				 String s=null;
				 while((s=br.readLine())!=null){
					 if(flag ==0){
						 System.out.println(file.getName());
						 System.out.println("\n");
						 System.out.println(s);
						 flag++;
					 }
					 else{
					 System.out.println(s);
					 System.out.println("\n");
					 }
				 }	
				 br.close();
				
			 }
			 
			 System.out.println("_________________________________\n");
			 System.out.println("===== ENTER THE TRANSCATION NUMBER YOU LIKE TO DELETE =====");
			 int a=sc.nextInt();
			 for (File file : listOfFiles) {
				 String ab=file.getName().replaceAll(".txt", "");
				 ab=ab.trim();
				 if(ab.equals(String.valueOf(a))){
 					 if(file.delete()){
			    			System.out.println(ab+ " is deleted!");
			    		}else{
			    			System.out.println("Delete operation is failed.");
			    		}
					 System.out.println("===== "+file.getName()+" TRANSCATION DELETED SUCCESFULLY =====");
				 }
				
			 }
				
		}

		
	
	}
}

