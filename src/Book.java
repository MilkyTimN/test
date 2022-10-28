public class Book implements Printable{

    private String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public Book() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book: " + bookName;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    public static void printBooks(Printable[] printable) {
        for (Printable e : printable) {
            if (e instanceof Book) {
                System.out.println(e);
            }
        }
        System.out.println("-----------");
    }
}
