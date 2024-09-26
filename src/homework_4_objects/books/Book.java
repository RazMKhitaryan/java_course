package homework_4_objects.books;

public class Book {
    private Author author;
    private String bookName;
    private int publishedYear;
    private int numberOfPages;

    public Book(String name, int yearOfPublication, int numberOfPages, Author author) {
        this.bookName = name;
        this.publishedYear = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", bookName='" + bookName + '\'' +
                ", publishedYear=" + publishedYear +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
