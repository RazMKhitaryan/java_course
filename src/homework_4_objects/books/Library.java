package homework_4_objects.books;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book getBook(String name) {
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(name)) {
                return book;
            }
        }
        return null;
    }

    public String[] getNames() {
        String[] names = new String[books.length];
        for (int i = 0; i < books.length; i++) {
            names[i] = books[i].getBookName();
        }
        return names;
    }
}
