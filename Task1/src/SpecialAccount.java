
public class SpecialAccount extends Account{
	private final double OVERDRAFT_LIMIT = -1000;
	@Override
	public boolean withdraw(double _amounttoWithdraw) {
		boolean check = false;
		double temp = balance - _amounttoWithdraw;
		if (temp<OVERDRAFT_LIMIT) check = false;
		else {
			this.balance = temp;
			check = true;
		}
		return check;
	}
	
	public SpecialAccount() {
		super();
	}
	public SpecialAccount(double _balance) {
		if (_balance>=-1000) this.balance = _balance;
		else System.out.println("Invalid amount");
	}
	public SpecialAccount(double _balance, int _accountNumber) {
		super(_balance,_accountNumber);
	}
	
	public SpecialAccount(int _accountNumber, double _balance) {
		super(_balance,_accountNumber);
	}
}
