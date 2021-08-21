package labels;

/**
 * US address that is not a PO box.
 * 
 * @author BrittanyP
*/
public class Address 
{
	private String street; 
	private String city; 
	private State state; 
	private int zip;
	
	/**
	 * @param street
	 * @param city
	 * @param state
	 * @param zip
	 */
	public Address(String street, String city, State state, int zip) 
	{
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}



	/**
	 * Returns the street address.
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * Returns the city or town. 
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}

	/**
	 * @return the zip
	 */
	public int getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
}
