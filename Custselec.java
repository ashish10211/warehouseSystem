import java.util.ArrayList;
import java.util.List;
public  class Custselec {

	public String selecprod;
	public int selecquant;
	public int price;
	public int stock;
    public static List<Custselec> cs=new ArrayList<Custselec>();
	public Custselec(String selecprodname,int selecquantno,int pprice,int sstock) {
		selecprod = selecprodname;
		price=pprice;
		this.selecquant=selecquantno;
		stock=sstock;
	}

	public String getSelecProd(){
		return this.selecprod;
	}

	public void setSelecprod(String selecprod) {
		this.selecprod = selecprod;
	}
	public int getselecquant(){
		return this.selecquant;
	}

	public void setSelecprodPrice(int pprice) {
		this.price = pprice;
	}
	public int getProductPrice(){
		return this.price;
	}
	public void setStock(int sstock) {
		this.stock = sstock;
	}
	public int getStock(){
		return this.stock;
	}
}
