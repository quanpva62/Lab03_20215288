package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media implements Playable{
    
    private String director;
    private int length;
    private static int nbDigitalVideoDiscs = 0;

	public DigitalVideoDisc(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost);
		this.director = director;
		this.length = length;
	}


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DigitalVideoDisc dvd = (DigitalVideoDisc) obj;
        return title != null && title.equals(dvd.title) && director != null && director.equals(dvd.director);
    }


    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (director != null ? director.hashCode() : 0);
        return result;
    }

    @Override
    public void play() {
    	System.out.println("Playing DVD: " + title + " directed by " + director);
    }


	@Override
	public String toString() {
        return "DVD - Title: " + title + ", Category: " + category + ", Cost: " + cost + ", Director: " + director + ", Length: " + length + " minutes";
    }
	@Override
    public int compareTo(Media other) {
        // Compare by title
        int titleComparison = this.title.compareTo(other.title);
        if (titleComparison != 0) {
            return titleComparison;
        }

        // If titles are the same, compare by cost in descending order
        return Float.compare(other.cost, this.cost);
    }
}