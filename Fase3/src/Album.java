import java.util.ArrayList;

public class Album {

	private String name;
	private String singer;
	private String categoria;
	private int size;
	private ArrayList<Music> lista_musicas;
	
	
	public Album (String name, String singer, String categoria, int size) {
		this.name = name;
		this.singer = singer;
		this.categoria = categoria;
		this.size = size;
		this.lista_musicas = new ArrayList <Music> (this.size);
	}
	
	
	public String get_name () {
		return this.name;
	}
	
	public String get_singer () {
		return this.singer;
	}
	
	public String get_categoria () {
		return this.categoria;
	}
	
	public void set_name (String new_name) {
		this.name = new_name;
	}
	
	public void set_singer (String new_singer) {
		this.singer = new_singer;
	}
	
	public void set_categoria (String new_categoria) {
		this.categoria = new_categoria;
	}
	
	
	public void to_String () {
		StringBuilder sb = new StringBuilder ();
		sb.append("Album: " + this.get_name() 	+ "\n");
		sb.append("Autor: " + this.get_singer() + "\n");
		sb.append("Categoria: " + this.get_categoria() + "\n");
		
		System.out.println(sb);
		
	}
	
}
