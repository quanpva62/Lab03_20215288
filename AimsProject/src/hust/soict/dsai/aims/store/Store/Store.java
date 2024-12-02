package hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private ArrayList<Media> itemsInStore;  
    private List<Media> medias;

    public Store() {
        this.itemsInStore = new ArrayList<>();
    }

    public Media getMediaByTitle(String title) {
        for (Media media : medias) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }
    public void removeMedia(String title) {
        medias.remove(title);
    }

    public void addMedia(Media media) {
        medias.add(media);
    }

    public List<Media> getAllMedia() {
        return medias;
    }
    public void displayStore() {
        System.out.println("********* Store *********");
        for (Media media : itemsInStore) {
            System.out.println("Media: " + media.getTitle() + ", Cost: " + media.getCost());
        }
    }
}