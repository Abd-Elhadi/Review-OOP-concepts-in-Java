import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainClass {

	public static void main(String[] args) {
		
		Abc obj = new Abc();
		
		/*
		Account ac = new Account();
		Account ac1 = new SpecialAccount();
		ac.deposit(1000);
		ac1.deposit(2000);

		if (ac.withdraw(1000)==true) {
			System.out.println("No enough money to withdraw");
		}
		
		if (ac1.withdraw(3000)==true) {
			System.out.println("withdraw succeeded");
		}
		
		System.out.println("Normal account balance: "+ac.getAccountBalance());
		System.out.println("Special account balance: "+ac1.getAccountBalance());
		
		
		Bank b = new Bank();
		b.addClientandhisAccount();		
		*/
	}
}

class Abc extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Abc() {
		setLayout(new FlowLayout());
		JLabel l = new JLabel("Hello, world");
		JLabel l1 = new JLabel("welcome Hadi");
		
		add(l);
		add(l1);
		
		this.setVisible(true);
		this.setSize(500,500);
	}
}
