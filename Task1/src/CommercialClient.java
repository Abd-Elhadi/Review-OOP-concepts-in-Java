
public class CommercialClient extends Client{
	private String CommercialID = "00000000000000";
	//empty constructor
	public CommercialClient(){}
	//parameterized constructor to initialize the attributes
	public CommercialClient(Account Acc,String name,String Address,String phone,String commercialID) {
		super(Acc,name,"00000000000000",Address,phone);
		this.CommercialID=commercialID;
	}
	//to return client's commercialID
	public String getCommercialID() {
		return this.CommercialID;
	}
	//to set client's commercialID
	public void setCommercialID(String commercialID) {
		this.CommercialID = commercialID;
	}
	//to get the data from the user as input
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
	@Override
	public String toString() {
		return String.format("Name: "+getName()+", Commercial ID: "+CommercialID+", Address: "+getAddress()+", Phone: "+getPhone()+", Account data: "+getAcc());
	}
}