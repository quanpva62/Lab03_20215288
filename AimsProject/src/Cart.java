//9
import java.util.ArrayList;

public class Cart {
    private ArrayList<DigitalVideoDisc> items = new ArrayList<>();
    private final int MAX_ITEMS = 20;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (items.size() < MAX_ITEMS) {
            items.add(disc);
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }
    //new method
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
    	for(DigitalVideoDisc dvd : dvdList) {
    		this.addDigitalVideoDisc(dvd);
    	}
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    	this.addDigitalVideoDisc(dvd1);
    	this.addDigitalVideoDisc(dvd2);
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (items.remove(disc)) {
            System.out.println("The disc has been removed.");
        } else {
            System.out.println("The disc is not in the cart.");
        }
    }

    public double totalCost() {
        double total = 0;
        for (DigitalVideoDisc disc : items) {
            total += disc.getCost();
        }
        return total;
    }
}
