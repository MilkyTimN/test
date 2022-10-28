public class Main {
    public static void main(String[] args) {


        Book book = new Book("Harry Potter");
        Book book1 = new Book("Game of Thrones");

        Magazine magazine = new Magazine("Maxim");
        Magazine magazine1 = new Magazine("Forbes");

        Printable[] printable = new Printable[]{
                book, book1, magazine, magazine1
        };

        for (Printable e : printable) {
            e.print();
        }
        System.out.println("----------");


        Book.printBooks(printable);

        Magazine.printMagazines(printable);


    }
}
