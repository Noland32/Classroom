public class Wilder {						

	private String firstName;      				// ATBS
	private boolean aware;  
	
	public Wilder(String firstName, boolean aware) {	// constructors
		this.firstName = firstName; 
		this.aware = false; 
	}

	// method instanciée

	public String whoAmI() {
		if (aware) {
			return "Je m'appelle "+firstName+" et je suis aware";		
		} else {
			return "Je m'appelle "+firstName+" et je ne suis pas aware";
		}
	}
	
	// getters

	public String getFirstName() {			
		return this.firstName;
	}
	public boolean isAware() {			
		return this.aware;
	}

	// setters

	public void setFirstName(String firstName) {		
		this.firstName = firstName;	
	}
	public void setAware(boolean aware) {		
		this.aware = aware;	
	}

	
}
