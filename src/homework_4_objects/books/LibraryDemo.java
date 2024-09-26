package homework_4_objects.books;

import java.util.Scanner;

public class LibraryDemo {
    public static void main(String[] args) {
        Author author1 = new Author("Hovhannes", "Tumanyan", "1869-02-19", "1923-03-23");
        Author author2 = new Author("Րաֆֆի", "Հակոբյան", "1835-07-31", "1888-04-25");

        Book book1 = new Book("Հեքիաթներ", 1944, 165, author1);
        Book book2 = new Book("Կայծեր", 1887, 223, author2);

        Library library = new Library(new Book[]{book1, book2});

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library!");

        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1 - List the names of all of the books present in the library");
            System.out.println("2 - Search for a book");
            System.out.println("0 - Exit");

            int repeat = scanner.nextInt();
            scanner.nextLine();
            switch (repeat) {
                case 1:
                    String[] names = library.getNames();
                    System.out.println("Books in the library:");
                    for (String name : names) {
                        System.out.println("- " + name);
                    }
                    break;

                case 2:
                    System.out.println("Enter the name of the book you want to search:");
                    String bookName = scanner.nextLine();
                    Book book = library.getBook(bookName);

                    if (book == null) {
                        System.out.println("Book not found. Please enter a valid name.");
                    } else {
                        boolean exit = false;
                        while (!exit) {
                            System.out.println("Book found: " + book.getBookName());
                            System.out.println("Choose an option to access information:");
                            System.out.println("1 - Access author information");
                            System.out.println("2 - Access year of publication");
                            System.out.println("3 - Access number of pages");
                            System.out.println("4 - Search for another book");
                            System.out.println("5 - List the names of all of the books present in the library");
                            System.out.println("0 - Exit");

                            int bookChoice = scanner.nextInt();
                            scanner.nextLine();
                            switch (bookChoice) {
                                case 1:
                                    System.out.println(book.getAuthor());
                                    break;
                                case 2:
                                    System.out.println("Year of publication: " + book.getPublishedYear());
                                    break;
                                case 3:
                                    System.out.println("Number of pages: " + book.getNumberOfPages());
                                    break;
                                case 4:
                                    exit = true;
                                    break;
                                case 5:
                                    String[] allNames = library.getNames();
                                    System.out.println("Books in the library:");
                                    for (String name : allNames) {
                                        System.out.println("- " + name);
                                    }
                                    break;
                                case 0:
                                    System.out.println("Exiting...");
                                    return;
                                default:
                                    System.out.println("Invalid option. Please try again.");
                            }
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}