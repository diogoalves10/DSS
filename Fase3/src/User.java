import java.util.HashMap;

public class User {

	private String name;
	private String email;
	private String password;
	//private HashMap <String, Music> HMM;
	//private HashMap <String, Video> HMV;
	
	
	public User (String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public String get_name () {
		return this.name;
	}
	
	public String get_email () {
		return this.email;
	}
	
	public String get_password () {
		return this.password;
	}
	
	
	public void set_name (String name) {
		this.name = name;
	}
	
	public void set_email (String email) {
		this.email = email;
	}
	
	public void set_password (String password) {
		this.password = password;
	}
	
    //not sure em relacao a isto
	/* public void change_name (String new_name) {
		
		if (new_name == this.name) 
			System.out.println("Nome introduzido inválido");
		
		else this.set_name(new_name);
	}
	
	public void change_email (String new_email) {
		
		if (new_email == this.email) 
			System.out.println("Email introduzido inválido");
		
		else this.set_email(new_email);
	}
	
	public void change_password (String new_password) {
		
		if (new_password == this.password) 
			System.out.println("Password introduzida inválida");
		
		else this.set_password(new_password); 
	} */
	
}
