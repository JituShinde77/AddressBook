import java.util.Scanner;
import java.util.ArrayList;

class AddressBook{

	private ArrayList<Person> personArray;
	private int numberOfPerson = 0;
	public Scanner sc = new Scanner(System.in);

	public AddressBook(){
		personArray = new ArrayList<Person>();
		//companyWageMap = new HashMap<>();
	}

	public Person takeUserInput()
	{
		System.out.print("Enter Person First Name: ");
                String firstName = sc.next();
                System.out.print("Enter Person Last Name: ");
                String lastName = sc.next();
                System.out.print("Enter Address: ");
                String address = sc.next();
                System.out.print("Enter State: ");
                String state = sc.next();
                System.out.print("Enter the Zip Code: ");
                long zipCode = sc.nextLong();
                System.out.print("Enter the Phone Number: ");
                long phoneNumber = sc.nextLong();
                Person person = new Person( firstName, lastName, address, state, zipCode, phoneNumber);
		return person;
	}

	public void addPerson(){
		Person person = takeUserInput();
		personArray.add(person);
		numberOfPerson++;
	}

	public void editPerson(){
		displayData();
		System.out.println("\n Enter name you want edit the record.");
	}

	public void displayData(){
		for (int i=0; i<personArray.size(); i++){
			System.out.println();
			personArray.get(i).readEntry();
		}
	}

	public static void main(String[] ars){
		int choice = 1;
		Scanner sc = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();
		while(choice != 0){
			System.out.println("\n Enter your Choice:");
			System.out.println("1. Add Person \n2. Delete Person \n3. Edit Person \n4. Show Address Book \n0. Exit");
			choice = sc.nextInt();
			if (choice == 1){
				addressBook.addPerson();
			}
			if(choice == 3){
				addressBook.editPerson();
			}
			if (choice == 4){
				System.out.println("Display Address Book...");
				addressBook.displayData();
			}
			if(choice == 0)
				break;
		}
	}
}

