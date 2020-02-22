
public class Account{
	protected double balance;
	protected int accountNumber;
	
	public Account() {
		balance = 0;
		accountNumber = 1;
	}
	public Account(double _balance) {
		if (_balance>=0) balance = _balance;
		else System.out.println("Invalid amount");
	}
	public Account(double _balance, int _accountNumber) {
		if (_balance<1) System.out.println("Invalid amount");
		else this.balance = _balance;
		if (_accountNumber<1) System.out.println("Invalid number");
		else this.accountNumber = _accountNumber;
	}
	
	public Account(int __accountNumber, double _Balanceb) {
		this(_Balanceb,__accountNumber);
	}
	
	public void setAccountBalance(double _balalance) {
		if (_balalance<1) System.out.println("Invalid amount");
		else balance = _balalance;
	}
	
	public void setAccountNumber(int _accountNumber) {
		if (_accountNumber<1) System.out.println("Invalid number");
		else accountNumber = _accountNumber;
	}
	
	public double getAccountBalance() {
		return balance;
	}
	
	public double getAccountNumber() {
		return accountNumber;
	}
	
	//every class in Java is child of Object class either directly or indirectly
	//toString is a method of class Object. we can use it to get string representation of an Object
	public String toString() {
		return "Account Balance: "+balance+", and Account number is: "+accountNumber;
	}
	
	public boolean withdraw(double _amounttoWithdraw) {
		boolean check = false;
		double temp = balance - _amounttoWithdraw;
		if (temp>=0) {
			check = false;
			balance = temp;
		}
		else {
			//System.out.println("Sorry. no enough balance to withdraw");
			check = true;
		}
		return check;
	}
	
	public void deposit(double _amounttoDeposit) {
		if (_amounttoDeposit<1) System.out.println("Invalid amount");
		else balance+=_amounttoDeposit;
	}
}
