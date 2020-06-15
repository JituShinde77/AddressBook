class Person{
	private String firstName;
	private String lastName;
	private String address;
	private String state;
	private long zipCode;
	private long phoneNumber;

	public Person(String firstName, String lastName, String address, String state, long zipCode, long phoneNumber){
		this.firstName = firstName;
        	this.lastName = lastName;
        	this.address = address;
        	this.state = state;
        	this.zipCode = zipCode;
        	this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString(){
		return "Name: "+firstName;
	}

	public static void main(String[] args){
		System.out.println("Welcome to Address Book...");
		Person person = new Person("Jit", "Shinde", "Baramati", "Maharastra", 412103L, 8830763172L);
		System.out.println(person);
	}
}
