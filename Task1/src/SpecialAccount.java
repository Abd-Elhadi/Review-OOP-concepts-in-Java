
public class SpecialAccount extends Account{
	@Override
	//this method will allow the user to overdraft with maximum up to -1000
	public String withdraw() {
		System.out.print("enter the amount you would like to withdraw: ");
		double amount=scan.nextDouble();
		//if it exceed the allowed overdraft then the message will shown
		if(this.get_balance()-amount<-1000)
			return "The account is lucked until a deposit is made to bring the account up to a positive value";
		//if a negative is given
		else if(amount<=0)
			return "Invalid amount"; 
		else {
			this.set_balance(this.get_balance()-amount);
			return "Sucessful Withdrawl";
		}
	}
}