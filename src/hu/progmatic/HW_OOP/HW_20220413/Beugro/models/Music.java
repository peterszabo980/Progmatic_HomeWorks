package hu.progmatic.HW_OOP.HW_20220413.Beugro.models;

public class Music {
    private Presenter presenter;
    private String title;
    private int published;
    private String publisher;
    private String genre;
    private String format;

    public Music() {

    }

    public Music(Presenter presenter, String title, int published, String publisher, String genre, String format) {
        this.presenter = presenter;
        this.title = title;
        this.published = published;
        this.publisher = publisher;
        this.genre = genre;
        this.format = format;
    }

    public void printInfo() {
        System.out.println("Az együttes adati");
        presenter.printInfo();
        System.out.println("Az album adatai: ");
        System.out.println("Cím:\t\t\t" + title);
        System.out.println("Megjelenés éve:\t" + published);
        System.out.println("Műfaj:\t\t\t" + genre);
        System.out.println("Kiadó:\t\t\t" + publisher);
        System.out.println("Kiadott formátumok:\t" + format);
    }

    public Presenter getPresenter() {
        return presenter;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
