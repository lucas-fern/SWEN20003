public class Library {
    private final int bookCapacity = 10;
    private int bookCount = 0;
    private Book books[];

    public Library() {
        books = new Book[bookCapacity];
    }

    public void addBook(Book book) {
        if (bookCount < bookCapacity) {
            books[bookCount] = book;
        }
        bookCount++;
    }

    public Book lookup(String title) {
        for (Book book: books) {
            if (book != null) {
                if (book.getTitle().equals(title)) {
                    return book;
                }
            }
        }
        return null;
    }

    public Book lookup(String title, String author) {
        for (Book book : books) {
            if (book != null) {
                if ((book.getTitle().equals(title)) && (book.getAuthor().equals(author))) {
                    return book;
                }
            }
        }
        return null;
    }

    public String getCatalogue() {
        String catalogue = "";
        for (Book book : books) {
            if (book != null) {
                catalogue = catalogue + book.toString();
            }
        }
        return catalogue;
    }
}