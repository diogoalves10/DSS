import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class Album {

	private String name;
	private String singer;
	private String categoria;
	private GregorianCalendar data_lancamento;
	private HashMap <Integer, Music> lista_musicas;
	
	
	public Album (String name, String singer, String categoria, int year, int month, int day) {
		this.name = name;
		this.singer = singer;
		this.categoria = categoria;
		this.data_lancamento = new GregorianCalendar (year, month, day);
		this.lista_musicas = new HashMap <Integer, Music> ();
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
	
	public GregorianCalendar get_data () {
		return this.data_lancamento;
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
	
	public void set_data (int year, int month, int day) {
		this.data_lancamento = new GregorianCalendar (year, month, day);
	}
	
	
	public void add_music (Music novo) {
		
		if (this.lista_musicas.containsKey(novo.get_ordemAlbum()))
			System.out.println("Já existe essa música no álbum!\n");
		
		else {
			this.lista_musicas.put(novo.get_ordemAlbum(), novo);
			System.out.println("Música adicionada ao álbum com sucesso.\n");
		}
		
	}
	
	public void erase_musica (Music novo) {
		
		if (!this.lista_musicas.containsKey(novo.get_ordemAlbum()))
			System.out.println("Esta música não existe neste álbum!\n");
		
		else {
			this.lista_musicas.remove(novo.get_ordemAlbum());
			System.out.println("Música apagada deste álbum com sucesso!\n");
		}
	}
	
	
	public void to_String () {
		StringBuilder sb = new StringBuilder ();
		sb.append("Album: " + this.get_name() 	+ "\n");
		sb.append("Autor: " + this.get_singer() + "\n");
		sb.append("Categoria: " + this.get_categoria() + "\n");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");	
		sb.append("Data de lançamento: " + sdf.format(data_lancamento.getTime()) + "\n");
		
		System.out.println(sb);
		
	}
	
}
