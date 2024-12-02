package hust.soict.dsai.aims.cart.Cart;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Media> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addMedia(Media media) {
        items.add(media);
    }

    public void removeMedia(String title) {
        items.remove(title);
    }

    public void printCart() {
        System.out.println("******* Cart *******");
        for (Media media : items) {
            System.out.println("Media: " + media.getTitle() + ", Cost: " + media.getCost());
        }
    }

    public void clear() {
        items.clear();
    }

    public List<Media> getAllItems() {
        return items;
    }
    
    public float totalCost() {
        float total = 0;
        for (Media media : items) {
            total += media.getCost();
        }
        return total;
    }
}