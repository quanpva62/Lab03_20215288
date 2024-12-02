package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	private ArrayList<String> authors;
	
	public Book(int id, String title, String category, float cost, List<String> authors) {
		super(id, title, category, cost);
		this.authors = new ArrayList<>(authors);
	}

	public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }
    public void removeAuthor(String authorName) {
        authors.remove(authorName);
    }
    
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
        return "Book - Title: " + title + ", Category: " + category + ", Cost: " + cost + ", Author: " + String.join(", ", authors);
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
