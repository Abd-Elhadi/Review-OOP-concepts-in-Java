import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	Scanner scan=new Scanner(System.in);
	private String name,address,phone;//The name, address and the phone number of the bank
	private ArrayList<Account> Accounts=new ArrayList<Account>();
	private ArrayList<Client> Clients=new ArrayList<Client>();
	
	//parameterized constructor to initialize the bank 
	public Bank(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	//to get the name of bank
	public String getName() {
		return name;
	}
    //to get the address of the bank
	public String getAddress() {
		return address;
	}
	//to get the phone number of the bank
	public String getPhone() {
		return phone;
	}
	//to set a name to the bank
	public void setName(String name) {
		this.name = name;
	}
	//to set an address to the bank
	public void setAddress(String address) {
		this.address = address;
	}
	//to set a phone number to the bank
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//ClientOption and AccountOption will be true if a valid choice made to create client and account
	boolean ClientOption = false, AccountOption = false, clientType = false;
	//this method will add a client with its account
	public void Add_Client() {
		Client newClient=new Client();
		CommercialClient CommercialClient=new CommercialClient();
		//while the given input to choose a desired type of client is false then this while loop will be repeated
		while (true) {
			System.out.println("Would you like to add a client or commercial client");
			System.out.println("1) For an Ordinary Client");
			System.out.println("2) For an Commercial Client");
			System.out.print("Your choice: ");
			String choice;
			choice=scan.next();
			if(choice.equalsIgnoreCase("1")) {
				newClient.get_data();
				Clients.add(newClient);
				ClientOption = true;
				clientType = true;
			}
			else if(choice.equalsIgnoreCase("2")) {
				CommercialClient.get_data();
				Clients.add(CommercialClient);
				ClientOption = true;
			}
			else {
				System.out.println("Invalid value");
			}
			//if ClientOption is false 
			//which means the user entered an invalid choice, then no need to execute to remaining part of this code
			if (!ClientOption) continue;
			//while the given input to choose a desired type of account is false then this while loop will be repeated
			while(ClientOption) {
				System.out.println("Would you like to add a Account or Special Account");
				System.out.println("1) For an Ordinary Account");
				System.out.println("2) For a Special Account");
				System.out.print("Your choice: ");
				choice=scan.next();
				if(choice.equalsIgnoreCase("1")) {
					Account newAccount=new Account();
					newAccount.set_account_number(Clients.size());
					newAccount.get_data();
					Accounts.add(newAccount);
					Clients.get(Clients.size()-1).setAccount(newAccount);
					if (clientType)
						Accounts.get(Accounts.size()-1).setMyClient(newClient);
					else
						Accounts.get(Accounts.size()-1).setMyClient(CommercialClient);
					
					AccountOption = true;
					break;
				}
				else if(choice.equalsIgnoreCase("2")) {
					SpecialAccount newAccount=new SpecialAccount();
					newAccount.set_account_number(Clients.size());
					newAccount.get_data();
					Accounts.add(newAccount);
					Clients.get(Clients.size()-1).setAccount(newAccount);
					if (clientType)
						Accounts.get(Accounts.size()-1).setMyClient(newClient);
					else
						Accounts.get(Accounts.size()-1).setMyClient(CommercialClient);
					
					AccountOption = true;
					break;
				}
				else {
					System.out.println("Invalid value");
					continue;
				}
			}
			//if a client and an account has been added to the ArrayList then this message will shown
			//and break out of the while loop
			if (ClientOption&&AccountOption) {
				System.out.println("A new Client with its account have been added successfuly.");
				break;
			} 
		}
	}
	//to check if the ArrayList is empty or not
	public boolean isEmpty() {
		if (Clients.isEmpty())
			return true;
		return false;
	}
	//to display the existing client with their accounts on the ArrayList
	public void Display() {
		if(Clients.isEmpty()) {
			System.out.println("There is no data to display");
		}
		for(int i=0;i<Clients.size();i++) {
			System.out.print((i+1)+") "+Clients.get(i).toString());
			System.out.println(", Account details: "+Accounts.get(i).toString());
		}
		
	}
	//to display the existing accounts on the ArrayList
	public void Display_Acc() {
		if(Clients.isEmpty()) {
			System.out.println("There is no data to display");
		}
		for(int i=0;i<Accounts.size();i++)
			System.out.println((i+1)+")"+Accounts.get(i).toString());
	}
	//to check if a given index is valid or not
	public boolean valid(int index) {
		if(index>=1&&index<=Clients.size())
			return true;
		return false;
	}
	//to perform a deposition for a specific client's account
	public String deposit(int index) {
		return Clients.get(index-1).getAcc().deposit();
	}
	//to perform a withdrawal for a specific client's account
	public String withdraw(int in) {
		return Clients.get(in-1).getAcc().withdraw();
	}
	//to edit client's information
	public void edit(int index) {
		System.out.println("1) To edit your name");
		System.out.println("2) To edit your address");
		System.out.println("3) To edit your phone");
		System.out.print("Your choice: ");
		int choice=scan.nextInt();
		if(choice==1) {
			System.out.print("Enter the new name: ");
			String _name = scan.next();
			Clients.get(index-1).setName(_name);
			System.out.println("Your name has been changed succeffuly");
		}
		else if(choice==2) {
			System.out.print("Enter the new address: ");
			String _address = scan.next();
			Clients.get(index-1).setAddress(_address);
			System.out.println("Your address has been changed succeffuly");
		}
		else if(choice==3) {
			System.out.print("Enter the new phone number: ");
			String _phone = scan.next();
			Clients.get(index-1).setPhone(_phone);
			System.out.println("Your phone number has been changed succeffuly");
		}
		else {
			System.out.println("Invalid choice ");
		}
	}
	//to get the data from the user
	public void get_data() {
		System.out.print("Enter the bank's name: ");
		this.name=scan.nextLine();
		System.out.print("Enter the bank's address: ");
		this.address=scan.nextLine();
		System.out.print("Enter the bank's phone: ");
		this.phone=scan.next();
	}
}