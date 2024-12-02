package hust.soict.dsai.aims.media;

import java.util.ArrayList;


public class CompactDisc extends Media implements Playable{
	
	private String artist;
	private ArrayList<Track> tracks;
	
	public CompactDisc(int id, String title, String category, float cost, String artist, ArrayList<Track> tracks) {
		super(id, title, category, cost);
		this.artist = artist;
		this.tracks = new ArrayList<>();
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void addTrack(Track track) {
		tracks.add(track);
	}
	public void removeTrack(Track track) {
		tracks.remove(track);
	}
	public ArrayList<Track> getTracks() {
	    return tracks;
	}

	@Override
	public void play() {
        System.out.println("Playing CD: " + title + " by " + artist);
        for (Track track : tracks) {
            System.out.println("Track: " + track.getTitle() + " (" + track.getLength() + " mins)");
        }
    }

	@Override
    public String toString() {
        return "CD - Title: " + title + ", Category: " + category + ", Cost: " + cost + ", Artist: " + artist;
    }
    @Override
    public int compareTo(Media other) {

        int titleComparison = this.title.compareTo(other.title);
        if (titleComparison != 0) {
            return titleComparison;
        }

        return Float.compare(other.cost, this.cost);
    }
}
