import java.util.Scanner;
/**
 * the main target is to implement a bank system
 *  this class will implement a Account class to represent the bank’s Account
 * @author Omar Hany (20180184)
 * 		   Abd Elhadi Omar (20180373)
 *         Sherif Hisham (20180134)
 */

public class Account {
	Scanner scan=new Scanner(System.in);
	private double balance;
	private int accountNumber;
	private Client myClient ;
	/**
	 * Declared balance of type double, accountNumber of type integer and myClient instance of the Class client
	 * which is the attributes each instance of the class Account should have
	 * 
	 */
	/**
	 * 
	 * @return
	 */
	public Client getMyClient() {
		return myClient;
	}
	/**
	 * 
	 * @param myClient
	 */
	public void setMyClient(Client myClient) {
		this.myClient = myClient;
	}
	
	/**
	 * empty constructor
	 */
	public Account() {
		this.balance=0.0;
		this.accountNumber=0;
	}

	/**
	 * parameterized constructor to initialize the balance
	 * @param d
	 */
	public Account(double d) {
		this.balance=d;
	}
	/**
	 * set the balance with the given balance
	 * @param d
	 */
	public void setBalance(double d) {
		this.balance=d;
	}
	/*
	 * set the account number with the given account number
	 * @param _accountNumber
	 */
	public void setAccountNumber(int _accountNumber) {
		this.accountNumber=_accountNumber;
	}
	/**
	 * return the balance
	 * @return
	 */
	public double getBalance() {
		return this.balance;
	}
	
	/**
	 * return the account number
	 * @return
	 */
	/**
	 * return account number
	 * @return
	 */
	public int getAccountNumber() {
		return this.accountNumber;
	}
	/**
	 * every class in Java is child of Object class either directly or indirectly
	 * toString is a method of class Object. 
	 * we can use it to get string representation of an Object of our class
	 * @return
	 */
	@Override
	public String toString() {
		//+",Client details: "+myClient
		return String.format("Account number: "+this.accountNumber+", Balance: "+this.balance);
	}
	/**
	 * withdraw method returns an string that tells if the action performed successfully or not
	 * @return
	 */
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
	/**
	 * deposit method returns an string that tells if the action performed successfully or not
	 * @return
	 */
	public String deposit() {
		System.out.print("Enter the amount you would like to deposit: ");
		double amount=scan.nextDouble();
		if(amount<=0)return "Invalid amount";
		else {
			this.balance+=amount;
			return "Sucessful deposit";
		}
	}
	/**
	 * getData to get the data of the account from user
	 */
	public void getData() {
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