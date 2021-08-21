package labels;

public class LabelApp 
{

	public static void main(String[] args) 
	{
		Address address1 = new Address("928 Euclid Ave", "Salt Lake City", State.AK, 84102); 
		System.out.println("address 1: " + address1.getStreet()); 
				
		AddressLabel addressLabel = new AddressLabel("Dan", "Smith", address1);
		System.out.println("addressLabel: " + addressLabel);
		
		addressLabel.printLabel();
		

	}

}
