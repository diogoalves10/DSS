import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Music {

	private String name;
	private String singer;
	private String categoria;
	private int ordem_album;
	private GregorianCalendar data_lancamento;
	private String filename;
	
	
	public Music (String name, String singer, String categoria, int ordem_album, int year, int month, int day, String filename) {
		this.name = name;
		this.singer = singer;
		this.categoria = categoria;
		this.ordem_album = ordem_album;
		this.data_lancamento = new GregorianCalendar (year, month, day);
		this.filename = filename;
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
	
	public int get_ordemAlbum () {
		return this.ordem_album;
	}
	
	public GregorianCalendar get_data () {
		return this.data_lancamento;
	}
	
	public String get_filename () {
		return this.filename;
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
	
	public void set_ordemAlbum (int ordem) {
		this.ordem_album = ordem;
	}
	
	public void set_data (int year, int month, int day) {
		this.data_lancamento = new GregorianCalendar (year, month, day);
	}
	
	
	public void to_String () {
		StringBuilder sb = new StringBuilder ();
		sb.append("Música: " + this.get_name() 	+ "\n");
		sb.append("Autor: " + this.get_singer() + "\n");
		sb.append("Categoria: " + this.get_categoria() + "\n");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");	
		sb.append("Data de lançamento: " + sdf.format(data_lancamento.getTime()) + "\n");
		
		System.out.println(sb);
		
	}
	
}
