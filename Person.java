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
		System.out.print("\t\t"+lastName);
		System.out.print("\t\t"+address);
		System.out.print("\t\t"+state);
		System.out.print("\t\t"+zipCode);
		System.out.println("\t\t"+phoneNumber);
	}


	public String writePerson(){
		String str = firstName+"\t"+lastName+"\t"+address+"\t"+state+"\t"+zipCode+"\t"+phoneNumber;
		return str;
	}


	public static void main(String[] args){
		System.out.println("Welcome to Address Book...");
		Person person = new Person("Jit", "Shinde", "Baramati", "Maharastra", 412103L, 8830763172L);
		person.readEntry();
		Person person2 = new Person("Jitu", "Shinde", "Baramati", "Maharastra", 412103L, 9762757483L);
		person2.readEntry();
		//System.out.println(person2);
		String str = "ABC";
		System.out.println(str.compareTo("DEF")); //-3 (Integer.valueOf('A') - Integer.valueOf('D'))
		System.out.println(str.compareTo("ABC")); //0 (equal string)
		System.out.println(str.compareTo("abc")); //-32 (Integer.valueOf('A') - Integer.valueOf('a'))
		System.out.println(str.compareTo("AB"));
		System.out.println(str.compareToIgnoreCase("ABc"));
		System.out.println(str.compareToIgnoreCase("X"));
		System.out.println(person.writePerson());
	}
}
