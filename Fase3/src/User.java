public class User {

	private String name;
	private String email;
	private String password;
	private boolean admin;
	
	
	
	public User (String name, String email, String password, boolean admin) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.admin = admin;
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
	
	public void to_string () {
		StringBuilder sb = new StringBuilder ();
		sb.append("Nome: " + this.get_name() + "\n");
		sb.append("Email: " + this.get_email() + "\n");
		sb.append("Password: " + this.get_password() + "\n");
		
		System.out.println(sb);
	}
	
}	
