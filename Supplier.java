
public class Supplier {
	private String name;
	private String person;
	private String mobNo;
	private String address;
	private String prodId;
	
    
	public Supplier(String theName,String thePerson,String theMobno,String theAddress,String theProdid)
	{
		name=theName;
		person=thePerson;
		mobNo=theMobno;
		address=theAddress;
		prodId=theProdid;
		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getPerson()
	{
		return this.person;
	}
	public String getMobno()
	{
		return this.mobNo;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	public String getProdid()
	{
		return this.prodId;
	}
}
