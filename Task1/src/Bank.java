import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	protected String name;
	protected String address;
	protected String phone;
	ArrayList<Account> allAccounts = new ArrayList<Account>();
	ArrayList<Client> allClients = new ArrayList<Client>();
	private Scanner input;
	
	public Bank() {	
	}
	
	public Bank(String _name, String _address, String _phone) {
		name = _name;
		address = _address;
		phone = _phone;
	}
	
	public void addClientandhisAccount() {
		input = new Scanner(System.in);
		while (true) {
			System.out.print("Which kind of client you want to add? \n[1] Client. \n[2] Commercial Client. \n[3] Exit ");
			String check = input.next();
			if (check.equals("1")) {
				System.out.print("Enter client's name: ");
				String name = input.next();
				System.out.print("Enter client's national ID: ");
				String nationalID = input.next();
				System.out.print("Enter clieant's address: ");
				String address = input.next();
				System.out.print("Enter client's phone: ");
				String phone = input.next();
				double balance;
				while (true) {
					System.out.println("Enter client's account balance: ");
					balance = input.nextDouble();
					if (balance>0) break;
					else {
						System.out.println("Invalid amount");
						continue;
					}
				}
				Account newAccount;
				while (true){
					System.out.print("[1] for Normal account, [2] for Special account: ");
					String accountType = input.next();
					if (accountType.equals("1")) {
						System.out.println("Your account type is normal");
						newAccount = new Account(balance);
						break;
					}
					else if (accountType.equals("2")) {
						System.out.println("Your account type is Commercial");
						newAccount = new SpecialAccount(balance);
						break;
					}
					else {
						System.out.println("Invalid choice. try again");
						continue;
					}
				}
				Client newClient = new Client(newAccount);
				newClient.setName(name);
				newClient.setAddress(address);
				newClient.setID(nationalID);
				newClient.setPhone(phone);
				allAccounts.add(newAccount);
				allClients.add(newClient);
				
				System.out.print("enter [a] to add another Client any other key to go back to menu: ");
				check = "";
				check = input.next();
				if (check.equalsIgnoreCase(("a"))) continue;
				else displayClients();
			}
			else if (check.equals("2")){
				System.out.print("Enter client's name: ");
				String name = input.next();
				System.out.print("Enter client's commercial ID: ");
				String commercialID = input.next();
				System.out.print("Enter clieant's address: ");
				String address = input.next();
				System.out.print("Enter client's phone: ");
				String phone = input.next();
				System.out.println("Enter client's account balance: ");
				double balance ;
				while (true) {
					System.out.println("Enter client's account balance: ");
					balance = input.nextDouble();
					if (balance>0) break;
					else {
						System.out.println("Invalid amount");
						continue;
					}
				}
				
				Account newAccount;
				while (true){
					System.out.print("[1] for Normal account, [2] for Special account: ");
					String accountType = input.next();
					if (accountType.equals("1")) {
						newAccount = new Account(balance);
						break;
					}
					else if (accountType.equals("2")) {
						newAccount = new SpecialAccount(balance);
						break;
					}
					else {
						System.out.println("Invalid choice. try again");
						continue;
					}
				}
				CommercialClient newClient = new CommercialClient(newAccount);
				
				newClient.setName(name);
				newClient.setAddress(address);
				newClient.setCommercialID(commercialID);
				newClient.setPhone(phone);
				allAccounts.add(newAccount);
				allClients.add(newClient);
				
				System.out.print("enter [a] to add another Client any other key to go back to menu: ");
				check = "";
				check = input.next();
				if (check.equalsIgnoreCase(("a"))) continue;
				else displayClients();
			}
			else if (check.equals("3")) {
				System.out.println("Thank you!");
				break;
			}
			else {
				System.out.println("Invalid input!");
			}
		}
	}
	
	public void displayClients() {
		for (int i=0; i<allClients.size(); ++i) {
			System.out.println(allClients.get(i));
		}
	}
}
