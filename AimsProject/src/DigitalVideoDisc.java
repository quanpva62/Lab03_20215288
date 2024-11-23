
public class DigitalVideoDisc {
    
	private String title;
    private String category;
    private String director;
    private int length;
    private double cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	
	public DigitalVideoDisc(String title) {
	    this.title = title;
	    nbDigitalVideoDiscs++;
	    this.id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String category, String title, double cost) {
	    this.category = category;
	    this.title = title;
	    this.cost = cost;
	    nbDigitalVideoDiscs++;
	    this.id = nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String director, String category, String title, double cost) {
	    this.director = director;
	    this.category = category;
	    this.title = title;
	    this.cost = cost;
	    nbDigitalVideoDiscs++;
	    this.id = nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
	    this.title = title;
	    this.category = category;
	    this.director = director;
	    this.length = length;
	    this.cost = cost;
	    nbDigitalVideoDiscs++;
	    this.id = nbDigitalVideoDiscs;
	}

}
