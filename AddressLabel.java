package labels;

/*
 * Represents an address label that. 
 */


public class AddressLabel 
{
	private String firstName;
	private String lastName;
	private Address address;
	/**
	 * Constructor of class AddressLabel
	 * 
	 * @param firstName of the addresses
	 * @param lastName of the addresses
	 * @param address US address
	 */
	public AddressLabel(String firstName, String lastName, Address address) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	/*(non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return "AddressLabel [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
	
	/*
	 * Prints an address label in the following format:
	 * {first name} {last name}
	 * {address}
	 * {city} {state} {zip}
	 */
	public void printLabel()
	{
		System.out.printf("%s %s%n", firstName, lastName);
		System.out.println(address.getStreet());
		System.out.printf("%s, %s %f%n", address.getCity(), address.getState(), address.getZip());
		
	}
	
	
	
}
