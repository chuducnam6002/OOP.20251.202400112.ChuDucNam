public class Cart {
    
    public static final int MAX_NUMBERS_ORDERED = 20;

    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered < MAX_NUMBERS_ORDERED){
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        int validCount = 0;  

        for (DigitalVideoDisc disc : dvdList) {
            if (disc != null) validCount++;
        }

        if (qtyOrdered + validCount > MAX_NUMBERS_ORDERED) {
            System.out.println("Not enough space in the cart.");
            return;
        }

        for (DigitalVideoDisc disc : dvdList) {
            if (disc == null) continue;
            itemsOrdered[qtyOrdered] = disc;.
            qtyOrdered++;
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if (qtyOrdered <= 18){
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
        } else {
            System.out.println("Not enough space in the cart.");
            return;
        }
    }


    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int removedIndex = -1;

        for (int i = 0; i < qtyOrdered; i++){
            if (itemsOrdered[i] == disc){
                removedIndex = i;
                break;
            }
        }

        if (removedIndex == -1){
            System.out.println("Item not found.");
            return;
        }

        for (int i = removedIndex; i < qtyOrdered - 1; i++){
            itemsOrdered[i] = itemsOrdered[i + 1];
        }

        itemsOrdered[qtyOrdered - 1] = null;

        qtyOrdered--;

        System.out.println("The disc was removed.");
    }

    public float totalCost(){
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++){
            total += itemsOrdered[i].getCost();
        }

        return total;
    }
}
