/**
 * the main target is to implement a bank system
 *  this class will implement a commercialClient class to represent the bank’s clients
 * @author Omar Hany (20180184)
 * 		   Abd Elhadi Omar (20180373)
 *         Sherif Hisham (20180134)
 */

public class CommercialClient extends Client{
	private String CommercialID = "00000000000000";
	//empty constructor
	public CommercialClient(){}
	//parameterized constructor to initialize the attributes
	/**
	 * 
	 * @param Acc
	 * @param name
	 * @param Address
	 * @param phone
	 * @param commercialID
	 */
	public CommercialClient(Account Acc,String name,String Address,String phone,String commercialID) {
		super(Acc,name,"00000000000000",Address,phone);
		this.CommercialID=commercialID;
	}
	/**
	 * to return client's commercialID
	 * @return
	 */
	public String getCommercialID() {
		return this.CommercialID;
	}
	/**
	 * to set client's commercialID
	 * @param commercialID
	 */
	public void setCommercialID(String commercialID) {
		this.CommercialID = commercialID;
	}
	/**
	 * to get the data from the user as input
	 */
	public void get_data() {
		System.out.print("Please enter your name: ");
		this.setName(scan.nextLine());
		System.out.print("Please enter your CommercialID: ");
		this.CommercialID=scan.nextLine();
		System.out.print("Please enter your Address: ");
		this.setAddress(scan.nextLine());;
		System.out.print("Please enter your Phone: ");
		this.setPhone(scan.next());
	}
	/**
	 * Overriding the method toString to print commercialID instead of nationalID
	 */
	@Override
	public String toString() {
		return String.format("Name: "+getName()+", Commercial ID: "+CommercialID+", Address: "+getAddress()+", Phone: "+getPhone()+", Account data: "+getAcc());
	}
}