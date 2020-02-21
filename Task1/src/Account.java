import java.util.Scanner;

public class Account {
	Scanner scan=new Scanner(System.in);
	private double balance;
	private int account_number;
	private Client myClient ;
		
	public Client getMyClient() {
		return myClient;
	}
	public void setMyClient(Client myClient) {
		this.myClient = myClient;
	}
	
	//empty constructor 
	public Account() {
		this.balance=0.0;
		this.account_number=0;
	}
	//parameterized constructor to initialize the balance
	public Account(double d) {
		this.balance=d;
	}
	//set the balance with the given balance
	public void set_balance(double d) {
		this.balance=d;
	}
	//set the account number with the given account number
	public void set_account_number(int num) {
		this.account_number=num;
	}
	//return the balance
	public double get_balance() {
		return this.balance;
	}
	//return the account number
	public int get_account_number() {
		return this.account_number;
	}
	//every class in Java is child of Object class either directly or indirectly
	//toString is a method of class Object. we can use it to get string representation of an Object of our class
	@Override
	
	public String toString() {
		//+",Client details: "+myClient
		return String.format("Account number: "+this.account_number+", Balance: "+this.balance);
	}
	//withdraw method returns an string that tells if the action performed successfully or not
	public String withdraw() {
		System.out.print("Enter the amount you would like to withdraw: ");
		double amount=scan.nextDouble();
		if(amount>this.balance)
			return "No enough money to withdraw";
		else if(amount<=0)
			return "Invalid amount"; 
		else {
			this.balance-=amount;
			return "Sucessful Withdrawl";
		}
	}
	//deposit method returns an string that tells if the action performed successfully or not
	public String deposit() {
		System.out.print("Enter the amount you would like to deposit: ");
		double amount=scan.nextDouble();
		if(amount<=0)return "Invalid amount";
		else {
			this.balance+=amount;
			return "Sucessful deposit";
		}
	}
	//get_data to get the data of the account from user
	public void get_data() {
		System.out.print("please enter balance: ");
		while(true) {
			double _balance = scan.nextDouble();
			if (_balance<0) {
				System.out.print("Invalid amount. \nRe-enter the balance again: ");
				continue;
			}
			else {
				this.balance = _balance;
				break;
			}
		}
	}
}