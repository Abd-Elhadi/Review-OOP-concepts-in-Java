
public class Client {
	protected String name;
	protected String nationalID;
	protected String address;
	String phone;
	Account account;
	
	public Client() {
		name = "";
		nationalID = "";
		address = "";
		phone = "";
		account = null;
	}
	
	public Client(Account _account) {
		this.account = _account;
	}
	
	public void setName(String _name) {
		this.name = _name;
	}
	
	public void setID(String _nationalID) {
		this.nationalID = _nationalID;
	}
	
	public void setAddress(String _address) {
		this.address = _address;
	}
	
	public void setPhone(String _phone) {
		this.phone = _phone;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNationalID() {
		return nationalID;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String toString() {
		return "Name: "+name+", national ID: "+nationalID+", address: "+address+", phone number: "+phone+", account: "+account;
	}
	
	public void clientAccount() {
		System.out.println(account);
	}
}
