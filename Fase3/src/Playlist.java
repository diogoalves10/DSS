import java.util.ArrayList;

public class Playlist {

	private String name;
	private int size;
	
	private ArrayList <Music> playlist_musicas;
	private ArrayList <Video> playlist_videos;
	
	public Playlist (String name) {
		this.name = name;
		this.size = 0;
		this.playlist_musicas = new ArrayList <Music> (10);
	}
	
	public Playlist (String name, int x) {
		this.name = name;
		this.size = 0;
		this.playlist_videos = new ArrayList <Video> (10);
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
	
}





