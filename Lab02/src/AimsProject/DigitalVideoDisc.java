public class DigitalVideoDisc {
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

<<<<<<< HEAD
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

=======
>>>>>>> topic/store
    public DigitalVideoDisc(String title){
        this.title = title;
    }  
    public DigitalVideoDisc(String category, String title, float cost){
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    public DigitalVideoDisc(String director, String category, String title, float cost){
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

}
<<<<<<< HEAD

=======
>>>>>>> topic/store
