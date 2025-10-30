public class Store {
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[100];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < itemsInStore.length) {
            itemsInStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("Added: '" + disc.getTitle() + "' to the store. Total items: " + qtyInStore);
        } else {
            System.out.println("The store is full. Cannot add more items.");
        }
    }

    public void removeDVD(String title) {
        int indexToRemove = -1;

        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].getTitle().equalsIgnoreCase(title)) { 
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            System.out.println("Removed: '" + itemsInStore[indexToRemove].getTitle() + "' from the store.");
            
            for (int i = indexToRemove; i < qtyInStore - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }
            itemsInStore[qtyInStore - 1] = null; 
            qtyInStore--; 
        } else {
            System.out.println("Error: DVD with title '" + title + "' not found in the store.");
        }
    }
}