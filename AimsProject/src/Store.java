import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    
    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println("The DVD [" + dvd.getTitle() + "] has been added to the store.");
    }

    
    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.remove(dvd)) {
            System.out.println("The DVD [" + dvd.getTitle() + "] has been removed from the store.");
        } else {
            System.out.println("The DVD [" + dvd.getTitle() + "] is not found in the store.");
        }
    }

    
    public void displayStore() {
        System.out.println("***********************STORE***********************");
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            for (int i = 0; i < itemsInStore.size(); i++) {
                DigitalVideoDisc dvd = itemsInStore.get(i);
                System.out.println((i + 1) + ". " + dvd.getTitle() + " - " 
                        + dvd.getCategory() + " - " 
                        + dvd.getDirector() + " - " 
                        + dvd.getLength() + " mins - " 
                        + dvd.getCost() + " $");
            }
        }
        System.out.println("***************************************************");
    }
}
