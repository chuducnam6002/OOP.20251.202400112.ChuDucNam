package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    
    private static int nbDigitalVideoDiscs = 0;
    private int id; 
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    
    public String getTitle() {return this.title;}
    public String getCategory() {return this.category;}
    public String getDirector() {return this.director;}
    public int getLength() {return this.length;}
    public float getCost() {return this.cost;}
    public int getId() {return this.id;} 

    public void setTitle(String title) {
        this.title = title;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Error: Length must be a positive number.");
        }
    }

    public DigitalVideoDisc(String title){
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs; 
        this.title = title;
    } 
    
    public DigitalVideoDisc(String category, String title, float cost){
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs; 
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    
    public DigitalVideoDisc(String director, String category, String title, float cost){
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs; 
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    
    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs; 
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    
    public String toString() {
        return "DVD - " + this.getTitle() + 
               " - " + this.getCategory() + 
               " - " + this.getDirector() + 
               " - " + this.getLength() + 
               ": " + this.getCost() + " $";
    }

    public boolean isMatch(String title) {
        return this.getTitle().toLowerCase().contains(title.toLowerCase());
    }


}