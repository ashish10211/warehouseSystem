import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class Test3 {
Database program;
@Before
public void test3() {
	program=new Database();
	
}	

@Test
	public void checkArrayList() {
	ArrayList<Products> ps=program.getProductList();
	int size=ps.size();
	assertNotNull(size);
	}
@Test
public void check(){
	HashMap<Integer,Custselec> map=new HashMap<Integer,Custselec>();
	int size=map.size();
	assertNotNull(size);
}
}
