package section;

public class Main {
    public static void main(String[] args) {

        // ---------book--------------
        // book.title;
        // book.author;
        //----------------------------
        Book book = new Book("채식주의자", "한강");

        book.add(5, 9);
        System.out.println(book.add(5, 9));
    }
}
