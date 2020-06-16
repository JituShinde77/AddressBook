public class Person{
	public String firstName;
	public String lastName;
	public String address;
	public String state;
	public long zipCode;
	public long phoneNumber;

	public Person(String firstName, String lastName, String address, String state, long zipCode, long phoneNumber){
		this.firstName = firstName;
        	this.lastName = lastName;
        	this.address = address;
        	this.state = state;
        	this.zipCode = zipCode;
        	this.phoneNumber = phoneNumber;
	}

	public void readEntry(){
		System.out.print(firstName);
		System.out.print("\t"+lastName);
		System.out.print("\t"+address);
		System.out.print("\t"+state);
		System.out.print("\t"+zipCode);
		System.out.print("\t"+phoneNumber);
	}


	public static void main(String[] args){
		System.out.println("Welcome to Address Book...");
		Person person = new Person("Jit", "Shinde", "Baramati", "Maharastra", 412103L, 8830763172L);
		person.readEntry();
		Person person2 = new Person("Jitu", "Shinde", "Baramati", "Maharastra", 412103L, 9762757483L);
		person2.readEntry();
		System.out.println(person2);
	}
}
