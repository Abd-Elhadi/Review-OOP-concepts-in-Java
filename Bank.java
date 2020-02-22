import java.util.ArrayList;
import java.util.Scanner;
/**
 * the main target is to implement a bank system
 *  this class will implement a bank class to represent the system
 * @author Omar Hany (20180184)
 * 		   Abd Elhadi Omar (20180373)
 *         Sherif Hisham
 */

public class Bank {
	Scanner input=new Scanner(System.in);
	private String name,address,phone;
	/*
	 * Declared name, address and phone
	 * which is of type String
	 * and taking input from user by using setters and getters
	 */
	
	private ArrayList<Account> accountList=new ArrayList<Account>();
	private ArrayList<Client> clientList=new ArrayList<Client>();
	/**
	 * declared two ArrayList accountList and clientList
	 * which is of type Account and Client respectively
	 */
	
	/**
	 * parameterized constructor to initialize the bank 
	 * @param name
	 * @param address
	 * @param phone
	 */
	public Bank(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	/**
	 * to get the name of bank
	 * @return
	 */
	public String getName() {
		return name;
	}
    /**
     * to get the address of the bank
     * @return
     */
	public String getAddress() {
		return address;
	}
	/**
	 * to get the phone number of the bank
	 * @return
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * to set a name to the bank
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * to set an address to the bank
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * to set a phone number to the bank
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * ClientOption and AccountOption will be true if a valid choice made to create client and account
	 */
	boolean clientOption = false, accountOption = false, clientType = false;
	
	/**
	 * addClient method will add a new Client with its attributes 
	 * firstly we need to know type of client the user wants to create
	 * by knowing the type of the we will call the appropriate Constructor, Setter and Getter 
	 * to get its details using Scanner class
	 */
	public void addClient() {
		Client newClient=new Client();
		CommercialClient CommercialClient=new CommercialClient();
		/**
		 * Declared two different type of Client
		 * to be used for the appropriate choice made by the user
		 */
		
		//while the given input to choose a desired type of client is false then this while loop will be repeated
		while (true) {
			System.out.println("Would you like to add a client or commercial client");
			System.out.println("1) For an Ordinary Client");
			System.out.println("2) For an Commercial Client");
			System.out.print("Your choice: ");
			String choice;
			choice=input.next();
			if(choice.equalsIgnoreCase("1")) {
				newClient.get_data();
				clientList.add(newClient);
				clientOption = true;
				clientType = true;
			}
			else if(choice.equalsIgnoreCase("2")) {
				CommercialClient.get_data();
				clientList.add(CommercialClient);
				clientOption = true;
			}
			else {
				System.out.println("Invalid value");
			}
			/**
			 * if ClientOption is false 
			 * which means the user entered an invalid choice, 
			 * then no need to execute to remaining part of this code
			 */
			if (!clientOption) continue;
			//while the given input to choose a desired type of account is false then this while loop will be repeated
			while(clientOption) {
				System.out.println("Would you like to add a Account or Special Account");
				System.out.println("1) For an Ordinary Account");
				System.out.println("2) For a Special Account");
				System.out.print("Your choice: ");
				choice=input.next();
				if(choice.equalsIgnoreCase("1")) {
					Account newAccount=new Account();
					newAccount.setAccountNumber(clientList.size());
					newAccount.getData();
					accountList.add(newAccount);
					clientList.get(clientList.size()-1).setAccount(newAccount);
					if (clientType)
						accountList.get(accountList.size()-1).setMyClient(newClient);
					else
						accountList.get(accountList.size()-1).setMyClient(CommercialClient);
					
					accountOption = true;
					break;
				}
				else if(choice.equalsIgnoreCase("2")) {
					SpecialAccount newAccount=new SpecialAccount();
					newAccount.setAccountNumber(clientList.size());
					newAccount.getData();
					accountList.add(newAccount);
					clientList.get(clientList.size()-1).setAccount(newAccount);
					if (clientType)
						accountList.get(accountList.size()-1).setMyClient(newClient);
					else
						accountList.get(accountList.size()-1).setMyClient(CommercialClient);
					
					accountOption = true;
					break;
				}
				else {
					System.out.println("Invalid value");
					continue;
				}
			}
			//if a client and an account has been added to the ArrayList then this message will shown
			//and break out of the while loop
			if (clientOption&&accountOption) {
				System.out.println("A new Client with its account have been added successfuly.");
				break;
			} 
		}
	}
	/**
	 * to check if the ArrayList is empty or not
	 * @return
	 */
	public boolean isEmpty() {
		if (clientList.isEmpty())
			return true;
		return false;
	}
	/**
	 * to display the existing client with their accounts on the ArrayList
	 */
	public void displayAllClients() {
		if(clientList.isEmpty()) {
			System.out.println("There is no data to display");
		}
		for(int i=0;i<clientList.size();i++) {
			System.out.print((i+1)+") "+clientList.get(i).toString());
			System.out.println(", Account details: "+accountList.get(i).toString());
		}
		
	}
	/**
	 * to display the existing accounts on the ArrayList
	 */
	public void displayAllAccounts() {
		if(clientList.isEmpty()) {
			System.out.println("There is no data to display");
		}
		for(int i=0;i<accountList.size();i++)
			System.out.println((i+1)+")"+accountList.get(i).toString());
	}
	/**
	 * to check if a given index is valid or not
	 * @param index
	 * @return
	 */
	public boolean valid(int index) {
		if(index>=1&&index<=clientList.size())
			return true;
		return false;
	}
	/**
	 * to perform a deposition for a specific client's account
	 * @param index
	 * @return
	 */
	public String deposit(int index) {
		return clientList.get(index-1).getAcc().deposit();
	}
	/**
	 * to perform a withdrawal for a specific client's account
	 * @param in
	 * @return
	 */
	public String withdraw(int in) {
		return clientList.get(in-1).getAcc().withdraw();
	}
	/**
	 * to edit client's information
	 * @param index
	 */
	public void edit(int index) {
		//get the name, address, and phone number to be replaced
		System.out.println("1) To edit your name");
		System.out.println("2) To edit your address");
		System.out.println("3) To edit your phone");
		System.out.print("Your choice: ");
		int choice=input.nextInt();
		if(choice==1) {
			System.out.print("Enter the new name: ");
			String _name = input.next();
			clientList.get(index-1).setName(_name);
			System.out.println("Your name has been changed succeffuly");
		}
		else if(choice==2) {
			System.out.print("Enter the new address: ");
			String _address = input.next();
			clientList.get(index-1).setAddress(_address);
			System.out.println("Your address has been changed succeffuly");
		}
		else if(choice==3) {
			System.out.print("Enter the new phone number: ");
			String _phone = input.next();
			clientList.get(index-1).setPhone(_phone);
			System.out.println("Your phone number has been changed succeffuly");
		}
		else {
			System.out.println("Invalid choice ");
		}
	}
	/**
	 * to get bank's data from the user
	 */
	public void getData() {
		System.out.print("Enter the bank's name: ");
		this.name=input.nextLine();
		System.out.print("Enter the bank's address: ");
		this.address=input.nextLine();
		System.out.print("Enter the bank's phone: ");
		this.phone=input.next();
	}
}