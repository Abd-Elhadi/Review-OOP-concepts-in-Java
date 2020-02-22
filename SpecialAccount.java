/**
 * the main target is to implement a bank system
 *  this class will implement a SpecialAccount class to represent the bank’s Account
 * @author Omar Hany (20180184)
 * 		   Abd Elhadi Omar (20180373)
 *         Sherif Hisham (20180134)
 */

public class SpecialAccount extends Account{
	@Override
	/**
	 * this method will allow the user to overdraft with maximum up to -1000
	 * it will return a string with the appropriate message for the action 
	 * @return
	 */
	public String withdraw() {
		System.out.print("enter the amount you would like to withdraw: ");
		double amount=scan.nextDouble();
		//if it exceed the allowed overdraft then the message will shown
		if(this.getBalance()-amount<-1000)
			return "The account is lucked until a deposit is made to bring the account up to a positive value";
		//if a negative is given
		else if(amount<=0)
			return "Invalid amount"; 
		else {
			this.setBalance(this.getBalance()-amount);
			return "Sucessful Withdrawl";
		}
	}
}