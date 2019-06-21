import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class Test2 {
Products program;
Database db;
@Before
public void test2() {
	program=new Products(null, 0, 0, null, 0);
}	
@Test
	public void setProductPrice() {
		int price=20;
		program.setProductPrice(20);
		program.getProductPrice();
		assertEquals(price,program.getProductPrice());
	}
@Before
public void setUp2() {
	db = new Database();
}
@Test
public void checkArrayList(){
	 ArrayList<Database> arraylist2=new ArrayList<Database>();
	 int size=arraylist2.size();
	 assertNotNull(size);
}
}
