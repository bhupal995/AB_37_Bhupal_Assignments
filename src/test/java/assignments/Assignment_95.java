package assignments;
//WAP to update the value of private variable username = "abc@grotechmind.com" 
//to something else using getter and setter
public class Assignment_95 {

	private String username = "abc@grotechmind.com" ;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public static void main(String[] args) {
		Assignment_95 A95 = new Assignment_95();		
		A95.setUsername("ram@123.com");
		System.out.println(A95.getUsername());
	}

}
