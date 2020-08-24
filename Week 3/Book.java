public class Book {

    private String author, title, borrowedBy;
    private boolean borrowed;
    private static int borrowedCount;

    public Book(String author, String title, boolean borrowed) {
        this.author = author;
        this.title = title;
        this.borrowed = borrowed;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean getBorrowed() {
        return borrowed;
    }

    public String getBorrowedBy() {
        return borrowedBy;
    }

    public String toString() {
        return String.format(this.author + ": " + this.title + "\n");
    }

    public boolean equals(Book b) {
        return this.author.equals(b.author) && this.title.equals(b.title);
    }

    public void borrow(String borrowedBy) {
        this.borrowed = true;
        this.borrowedBy = borrowedBy;
    }

    public void returnBook() {
        this.borrowed = false;
        this.borrowedBy = null;
    }

    public int borrowedCount() {
        return borrowedCount;
    }
}