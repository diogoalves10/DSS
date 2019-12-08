public class Video {

	private String name;
	private String categoria;
	private String filename;
	
	
	public Video (String name, String categoria, String filename) {
		this.name = name;
		this.categoria = categoria;
		this.filename = filename;
	}
	
	
	public String get_name () {
		return this.name;
	}
	
	public String get_categoria () {
		return this.categoria;
	}
	
	public String get_filename () {
		return this.filename;
	}
	
	
	public void set_name (String new_name) {
		this.name = new_name;
	}
	
	
	public void set_categoria (String new_categoria) {
		this.categoria = new_categoria;
	}
	
	public void to_String () {
		StringBuilder sb = new StringBuilder ();
		sb.append("Vídeo: " + this.get_name() 	+ "\n");
		sb.append("Categoria: " + this.get_categoria() + "\n");
		
		System.out.println(sb);
		
	}
	
}
