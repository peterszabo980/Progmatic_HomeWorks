package hu.progmatic.HW_OOP.HW_20220413.Beugro.models;

public class Book {
   /* private String author;*/
    private Author author;
    private String title;
    private int published;
    private String genre;


    public Book() {

    }

    public Book(Author author, String title, int published, String genre) {
        this.author = author;
        this.title = title;
        this.published = published;
        this.genre = genre;
    }

    public void printInfo() {
        System.out.println("SZERZŐ ADATAI:");
        author.printInfo(); // itt írja ki a könyv szerző adatait, amit az Author osztály tartalmaz
        System.out.println("KÖNYV ADATAI:");
        System.out.println("Cím:\t\t\t" + title);
        System.out.println("Megjelenés éve:\t" + published);
        System.out.println("Műfaj:\t\t\t" + genre);
    }

    /*public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }*/

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

   /* public String printInfo() {
        return this.getAuthor() + " " + this.getTitle() + " " + this.getPublished() + " " + this.getGenre();
    }*/


}
