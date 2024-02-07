import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album (String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong (String title, double duration) {
        Song song = new Song(title,duration);
        if(songs.contains(song)) {
            return false;
        } else  {
            songs.add(song);
            return true;
        }
    }
    public Song findSong (String title) {
        for(Song s: songs) {
            if(s.getTitle().equals(title)) {
                return s;
            }
        }
        return null;
    }

    public boolean addToPlayList (int trackNumber, LinkedList<Song> playList) {
        if(trackNumber > songs.size()-1) {
            return false;
        } else {
            Song song = songs.get(trackNumber);
            if(playList.contains(song)) {
                return false;
            } else {
                playList.add(song);
                return true;
            }
        }
    }

    public boolean addToPlayList (String title, LinkedList<Song> playList) {
        for(Song s: playList) {
            if(s.getTitle().equals(title)) {
                return false;
            } else {
                playList.add(s);
                    return true;
            }
        }
        return false;


    }

}
