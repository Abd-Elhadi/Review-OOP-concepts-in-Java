import java.util.Scanner;

public class Task1 {
	static Bank bank=new Bank("Default Name","Default Address","0100");
	static Scanner scan=new Scanner(System.in);
	//this is the interface that represents the relationship between the classes
	public static void Display_Menu(){
		System.out.println("Welcome to the banking system");
		
		bank.get_data();//get the name, address and the phone number of the bank
		//while the user wants to perform an action with the bank
		//then the loop will be repeated
		while(true) {
			System.out.println("Choose one of the following options");
			System.out.println("1) Create a client");
			System.out.println("2) Display all existing clients");
			System.out.println("3) Display all existing accounts");
			System.out.println("4) Exit");
			System.out.print("Your choice: ");
			String choice;
			choice=scan.next();
			if(choice.equalsIgnoreCase("1")) {
				//Add_Client is a method used to add a client with its attributes to the system
				bank.Add_Client();
			}
			else if(choice.equalsIgnoreCase("2")) {
				bank.Display();
				if (bank.isEmpty()) {
					continue;
				}
				else System.out.println("would you like to perform an action(Y/N)");
				String option=scan.next();
				if(option.equalsIgnoreCase("n")) continue;
				else if(!option.equalsIgnoreCase("y")) {
					System.out.println("Invalid");
					continue;
				}
				System.out.print("Enter the number of the client that you would like to perform an action on: ");
				int in=scan.nextInt();
				//if no attributes available then no need to execute the rest of the code
				if(!bank.valid(in)) 
					continue;
				System.out.println("chooce one of the following options to perform an action");
				System.out.println("1)deposit");
				System.out.println("2)withdraw");
				System.out.println("3)edit client data");
				System.out.println("4)go back to main menu");
				System.out.print("Your choice: ");
				option=scan.next();
				if(option.equalsIgnoreCase("1")) {
					System.out.println(bank.deposit(in));
				}
				else if(option.equals("2")) {
					System.out.println(bank.withdraw(in));
				}
				else if(option.equals("3")) {
					bank.edit(in);
				}
				else {
					continue;
				}
			}
			else if(choice.equalsIgnoreCase("3")){
				bank.Display_Acc();
			}
			else if(choice.equals("4")) {
				System.exit(0);
			}
			else {
				System.out.println("Invalid choice");
			}
		}
	}
	public static void main(String[] args) {
		Display_Menu();
	}
}