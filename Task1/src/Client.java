import java.util.Scanner;

/**
 * the main target is to implement a bank system
 *  this class will implement a Client class to represent the bank’s clients
 *@author Omar Hany (20180184)
 * 		   Abd Elhadi Omar (20180373)
 *         Sherif Hisham (20180134)
 */

public class Client {
	Scanner scan=new Scanner(System.in);
	private String name,nationalID,Address,phone;
	private Account myAccount = new Account();
	/**
	 * Declared name, nationalID, address, phone number 
	 * of type String and myAccount instance of the class Account
	 * which is the attributes each instance should have
	 */
	
	/**
	 * empty constructor
	 */
	public Client() {}
	/**
	 * parameterized constructor to initialize the attributes
	 * @param account
	 * @param name
	 * @param NationalID
	 * @param Address
	 * @param phone
	 */
	public Client(Account account,String name,String NationalID,String Address,String phone) {
		this.myAccount=account;
		this.name=name;
		this.nationalID=NationalID;
		this.Address=Address;
		this.phone=phone;
	}
	/**
	 * to get client's name
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * to get client's nationalID
	 * @return
	 */
	public String getNationalID() {
		return nationalID;
	}
	/**
	 * to get client's Address
	 * @return
	 */
	public String getAddress() {
		return Address;
	}
	/**
	 * to get client's phone
	 * @return
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * to get client's account
	 * @return
	 */
	public Account getAcc() {
		return myAccount;
	}
	/**
	 * to set client's name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * to set client's nationalID
	 * @param nationalID
	 */
	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}
	/**
	 * to set client's Address
	 * @param address
	 */
	public void setAddress(String address) {
		this.Address = address;
	}
	/**
	 * to set client's phone
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * to set client's account
	 * @param account
	 */
	public void setAccount(Account account) {
		this.myAccount = account;
	}
	@Override
	public String toString() {
		//+", Account data: "+myAccount
		return String.format("Name: "+name+", National ID: "+nationalID+", Address: "+Address+", Phone: "+phone);
	}
	/**
	 * to get the data from the user as input
	 */
	public void get_data() {
		System.out.print("Please enter your name: ");
		this.name=scan.nextLine();
		System.out.print("Please enter your NationaID: ");
		this.nationalID=scan.nextLine();
		System.out.print("Please enter your Address: ");
		this.Address=scan.nextLine();
		System.out.print("Please enter your Phone: ");
		this.phone=scan.next();
	}
}
