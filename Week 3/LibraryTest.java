public class LibraryTest {
    public static void main(String[] args) {
        Library stKilda = new Library();

        Book book1 = new Book("Alistair Moffat", "Programming Problem Solving and Abstraction with C", true);
        Book book2 = new Book("Dr. Seuss", "Green Eggs and Ham", false);

        stKilda.addBook(book1);
        stKilda.addBook(book2);

        System.out.println(stKilda.getCatalogue());
    }
}