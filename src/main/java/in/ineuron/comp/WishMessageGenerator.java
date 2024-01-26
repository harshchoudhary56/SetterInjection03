package in.ineuron.comp;

import java.util.Date;

// Target class (userDefined)
public class WishMessageGenerator {
	private Date date;
	
	static {
		System.out.println("WishMessageGenerator.class file is loading");
	}
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator object is instantiated...");
	}
	
	public void setDate(Date date) {
		this.date = date;
		System.out.println("Setter method is called to perform setter injection...");
	}
	
	// Business logic method ==> Using dependent object in business logic
	public String generateMessage(String userName) {
		int hour = date.getHours();
		
		if(hour < 12) {
			return "Good Morning :: " + userName;
		} else if(hour < 16) {
			return "Good AfterNoon :: " + userName;
		} else if(hour < 20) {
			return "Good Evening :: " + userName;
		} else {
			return "Good Night :: " + userName;
		} 
	}
}
