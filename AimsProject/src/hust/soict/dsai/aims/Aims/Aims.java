package hust.soict.dsai.aims.Aims;		
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store.Store;
import hust.soict.dsai.aims.media.*;

import java.util.Scanner;

public class Aims {

    private static Store store = new Store(); 
    private static Cart cart = new Cart();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            showMenu();
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    viewStoreMenu(scanner);
                    break;
                case 2:
                    updateStoreMenu(scanner);
                    break;
                case 3:
                    viewCartMenu(scanner);
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }


    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3: ");
    }


    public static void viewStoreMenu(Scanner scanner) {
        while (true) {
            storeMenu();
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    viewMediaDetails(scanner);
                    break;
                case 2:
                    addMediaToCart(scanner);
                    break;
                case 3:
                    playMedia(scanner);
                    break;
                case 4:
                    viewCartMenu(scanner);
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }


    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4: ");
    }


    public static void viewMediaDetails(Scanner scanner) {
        System.out.print("Enter the title of the media: ");
        String title = scanner.nextLine();
        Media media = store.getMediaByTitle(title); 
        if (media != null) {
            System.out.println(media);
            mediaDetailsMenu(scanner, media);
        } else {
            System.out.println("Media not found.");
        }
    }


    public static void mediaDetailsMenu(Scanner scanner, Media media) {
        while (true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add to cart");
            System.out.println("2. Play");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.print("Please choose a number: 0-1-2: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    cart.addMedia(media);
                    System.out.println("Media added to cart.");
                    break;
                case 2:
                    if (media instanceof Playable) {
                        ((Playable) media).play(); 
                    } else {
                        System.out.println("This media cannot be played.");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }


    public static void addMediaToCart(Scanner scanner) {
        System.out.print("Enter the title of the media to add to the cart: ");
        String title = scanner.nextLine();
        Media media = store.getMediaByTitle(title); 
        if (media != null) {
            cart.addMedia(media);
            System.out.println("Media added to cart.");
        } else {
            System.out.println("Media not found.");
        }
    }


    public static void playMedia(Scanner scanner) {
        System.out.print("Enter the title of the media to play: ");
        String title = scanner.nextLine();
        Media media = store.getMediaByTitle(title); 
        if (media != null) {
            if (media instanceof Playable) {
                ((Playable) media).play();
            } else {
                System.out.println("This media cannot be played.");
            }
        } else {
            System.out.println("Media not found.");
        }
    }


    public static void updateStoreMenu(Scanner scanner) {
        while (true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add media to store");
            System.out.println("2. Remove media from store");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.print("Please choose a number: 0-1-2: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    addMediaToStore(scanner);
                    break;
                case 2:
                    removeMediaFromStore(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }


    public static void addMediaToStore(Scanner scanner) {
        System.out.print("Enter the title of the media to add to the store: ");
        String title = scanner.nextLine();

    }


    public static void removeMediaFromStore(Scanner scanner) {
        System.out.print("Enter the title of the media to remove from the store: ");
        String title = scanner.nextLine();
        store.removeMedia(title);
        System.out.println("Media removed from store.");
    }

    public static void viewCartMenu(Scanner scanner) {
        while (true) {
            cartMenu();
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    filterMediasInCart(scanner);
                    break;
                case 2:
                    sortMediasInCart(scanner);
                    break;
                case 3:
                    removeMediaFromCart(scanner);
                    break;
                case 4:
                    playMedia(scanner);
                    break;
                case 5:
                    placeOrder();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }


    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4-5: ");
    }


    public static void filterMediasInCart(Scanner scanner) {
        System.out.println("Filter by: ");
        System.out.println("1. ID");
        System.out.println("2. Title");
        int option = scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case 1:

                break;
            case 2:

                break;
            default:
                System.out.println("Invalid option.");
        }
    }


    public static void sortMediasInCart(Scanner scanner) {
        System.out.println("Sort by: ");
        System.out.println("1. Title");
        System.out.println("2. Cost");
        int option = scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case 1:

                break;
            case 2:

                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    public static void removeMediaFromCart(Scanner scanner) {
        System.out.print("Enter the title of the media to remove from the cart: ");
        String title = scanner.nextLine();
        cart.removeMedia(title);
        System.out.println("Media removed from cart.");
    }


    public static void placeOrder() {
        System.out.println("Order placed successfully.");
        cart.clear();
    }
}