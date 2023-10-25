public class Book {
    public String title;
    public int yearOfPublishing;
    public boolean isAvailable;
    public static void main(String[] args) {
        Book book = new Book();

        book.title = "Through the looking glass";
        book.yearOfPublishing = 1871;
        book.isAvailable = true;

        System.out.println(book.title);
        System.out.println(book.yearOfPublishing);
        System.out.println(book.isAvailable);
    }
}