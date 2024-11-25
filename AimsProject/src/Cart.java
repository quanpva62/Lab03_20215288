
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

    
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            this.addDigitalVideoDisc(dvd);
        }
    }

    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        this.addDigitalVideoDisc(dvd1);
        this.addDigitalVideoDisc(dvd2);
    }

    // Print cart
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        double totalCost = 0;
        for (int i = 0; i < items.size(); i++) {
            DigitalVideoDisc dvd = items.get(i);
            System.out.println((i + 1) + ". DVD - " 
                    + dvd.getTitle() + " - " 
                    + dvd.getCategory() + " - " 
                    + dvd.getDirector() + " - " 
                    + dvd.getLength() + ": " 
                    + dvd.getCost() + " $");
            totalCost += dvd.getCost();
        }
        System.out.println("Total cost: " + totalCost);
        System.out.println("***************************************************");
    }



    // Remove a disc from cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (items.remove(disc)) {
            System.out.println("The disc has been removed.");
        } else {
            System.out.println("The disc is not in the cart.");
        }
    }

    // Calculate total cost
    public double totalCost() {
        double total = 0;
        for (DigitalVideoDisc disc : items) {
            total += disc.getCost();
        }
        return total;
    }
}
