import java.util.Scanner;

public class Client {
	Scanner scan=new Scanner(System.in);
	private String name,NationalID,Address,phone;
	private Account myAccount = new Account();
	
	//empty constructor
	public Client() {}
	//parameterized constructor to initialize the attributes
	public Client(Account account,String name,String NationalID,String Address,String phone) {
		this.myAccount=account;
		this.name=name;
		this.NationalID=NationalID;
		this.Address=Address;
		this.phone=phone;
	}
	//to get client's name
	public String getName() {
		return name;
	}
	//to get client's nationalID
	public String getNationalID() {
		return NationalID;
	}
	//to get client's Address
	public String getAddress() {
		return Address;
	}
	//to get client's phone
	public String getPhone() {
		return phone;
	}
	//to get client's account
	public Account getAcc() {
		return myAccount;
	}
	//to set client's name
	public void setName(String name) {
		this.name = name;
	}
	//to set client's nationalID
	public void setNationalID(String nationalID) {
		this.NationalID = nationalID;
	}
	//to set client's Address
	public void setAddress(String address) {
		this.Address = address;
	}
	//to set client's phone
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//to set client's account
	public void setAccount(Account account) {
		this.myAccount = account;
	}
	@Override
	public String toString() {
		//+", Account data: "+myAccount
		return String.format("Name: "+name+", National ID: "+NationalID+", Address: "+Address+", Phone: "+phone);
	}
	//to get the data from the user as input
	public void get_data() {
		System.out.print("Please enter your name: ");
		this.name=scan.nextLine();
		System.out.print("Please enter your NationaID: ");
		this.NationalID=scan.nextLine();
		System.out.print("Please enter your Address: ");
		this.Address=scan.nextLine();
		System.out.print("Please enter your Phone: ");
		this.phone=scan.next();
	}
}
