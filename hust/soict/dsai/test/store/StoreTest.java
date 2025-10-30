package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.store.Store; 
import hust.soict.dsai.aims.disc.DigitalVideoDisc; 

public class StoreTest {
    public static void main(String[] args) {
        Store myStore = new Store();

        DigitalVideoDisc dvdA = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 15.99f);
        DigitalVideoDisc dvdB = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 12.50f);
        DigitalVideoDisc dvdC = new DigitalVideoDisc("Animation", "Zootopia", 9.99f); 

        System.out.println("TESTING: addDVD");
        myStore.addDVD(dvdA);
        myStore.addDVD(dvdB);
        myStore.addDVD(dvdC);
        
        System.out.println("\nTESTING: removeDVD (Successful Case)");
        myStore.removeDVD("The Dark Knight");
        
        System.out.println("\nTESTING: removeDVD (Not Found Case)");
        myStore.removeDVD("Avatar");
        
        System.out.println("\nTESTING: removeDVD (First Item)");
        myStore.removeDVD("Inception");
    }
}
