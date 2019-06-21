
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test1 {
	Transcation program;
	Products pd;
	Database db;
	@Before
	public void setUp() {
		program = new Transcation();
	}
	@Before
	public void setUp2() {
		pd = new Products(null, 0, 0, null, 0);
	}
	@Before
	public void setUp3() {
		db = new Database();
	}
    @Test
    public void fpoints(){
    	assertEquals(20, program.fpoints(20));
    }
    //if we select option 2
  @Test
  public void setStock(){
	  int stock=15;
	  pd.setStock(15);
	  assertEquals(15,pd.getStock());
  }
  @Test
  public void checkArrayList(){
	  ArrayList<Supplier> arraylist3=new ArrayList<Supplier>();
	  int size=arraylist3.size();
	  assertNotNull(size);
  }
}
