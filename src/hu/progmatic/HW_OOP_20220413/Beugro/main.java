package hu.progmatic.HW_OOP_20220413.Beugro;

import hu.progmatic.HW_OOP_20220413.Beugro.models.Author;
import hu.progmatic.HW_OOP_20220413.Beugro.models.Book;
import hu.progmatic.HW_OOP_20220413.Beugro.models.Music;
import hu.progmatic.HW_OOP_20220413.Beugro.models.Presenter;

public class main {
    public static void main(String[] args) {
        Author bradbury = new Author("Ray Bradbury", "Waukegan", 1920);
        Author mezga = new Author("Mézga Géza", "Magyarország", 1928);

        Book fh451 = new Book();
        fh451.setAuthor(bradbury);
        fh451.setTitle("Fahrenheit 451");
        fh451.setPublished(1953);
        fh451.setGenre("dystopian novel");

        fh451.printInfo();
        System.out.println("=====================");

        Book mg = new Book(mezga, "Mézga Család",  1960, "rajzfilm");

        mg.printInfo();
        //System.out.println(fh451.getAuthor() + " " + fh451.getTitle() + " " + fh451.getPublished() + " " + fh451.getGenre());
        System.out.println("=====================");
        Presenter iron = new Presenter("Iron Mainde", "Angol", 1980);

        Music irmd = new Music();
        irmd.setPresenter(iron);
        irmd.setTitle("Iron Mainden");
        irmd.setPublished(1980);
        irmd.setPublisher("EMI");
        irmd.setGenre("heavy metal");
        irmd.setFormat("CD, CS, LP 8T");

        irmd.printInfo();


    }
}
