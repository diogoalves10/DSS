import java.util.HashMap;

public class Playlist {

	private String name;
	private int size;
	
	private HashMap <Integer,Music> playlist_musicas;
	private HashMap <Integer,Video> playlist_videos;
	
	public Playlist (String name) {
		this.name = name;
		this.size = 0;
		this.playlist_musicas = new HashMap <Integer,Music> ();
		this.playlist_videos = new HashMap <Integer,Video> ();
	}
	
	public String get_name () {
		return this.name;
	}
	
	public int get_size () {
		return this.size;
	}
	
	
	public boolean isFull () {
		return (size == 10);
	}
	
	public void add_music (Music nova) {
		
		if (this.isFull ())
			System.out.println ("A playlist está cheia!\n");
		
		else {
			this.playlist_musicas.put(this.size, nova);
			this.size++;
			System.out.println ("Musica adicionada à playlist com sucesso!\n");
		}
	}
	
	public void add_video (Video novo) {
		
		if (this.isFull ())
			System.out.println ("A playlist está cheia!\n");
		
		else {
			this.playlist_videos.put(this.size, novo);
			this.size++;
			System.out.println ("Vídeo adicionado à playlist com sucesso!\n");
		}
	}
	
	public void remove_music (int x) {
		
		if (!this.playlist_musicas.containsKey(x))
			System.out.println ("Não existe música!\n");
		
		else {
			this.playlist_musicas.remove(x);
			this.size--;
			System.out.println ("Música removida com sucesso!\n");
		}
	}
	
	public void remove_video (int x) {
		
		if (!this.playlist_videos.containsKey(x))
			System.out.println ("Não existe vídeo!\n");
		
		else {
			this.playlist_videos.remove(x);
			this.size--;
			System.out.println ("Video removida com sucesso!\n");
		}
	}

	
	
}
