public class Admin {

	private String name;
	private String email;
	private String password;
	
	public Admin (String name, String email, String password) {
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
	
	
	public void createAccount (String name, String email, String password, HashMap <String, User> hm) {
		
		if (hm.containsKey(email)) 
			System.out.println ("Já existe uma conta associada a essa email!");
		
		else {
			User novo = new User (name, email, password);
			hm.put(email, novo);
			System.out.println("Conta criada com sucesso");
		} 
	}
	
	public void eraseAccount (String name, String email, String password, HashMap <String, User> hm) {
		
		if (!hm.containsKey(email)) 
			System.out.println("Não existe nenhuma conta associada a esse email");
		
		else {
			hm.remove(email);
			System.out.println("Conta eliminada com sucesso");
		}
	}
	
}
