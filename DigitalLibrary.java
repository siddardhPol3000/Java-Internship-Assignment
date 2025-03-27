import java.util.*;

class Book {
    private String bookId;
    private String title;
    private String author;
    private String genre;
    private String availabilityStatus;
    
    public Book(String bookId, String title, String author, String genre, String availabilityStatus) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availabilityStatus = availabilityStatus;
    }
    
    public String getBookId() {
        return bookId;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public String getAvailabilityStatus() {
        return availabilityStatus;
    }
    
    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
    
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author + 
        ", Genre: " + genre + ", Book Status: " + availabilityStatus;
    }
}

class LibraryManagementSystem {
    private final Map<String, Book> books;
    
    public LibraryManagementSystem() {
        this.books = new HashMap<>();
    }
    
    public void addBook(String bookId, String title, String author, String genre, String availabilityStatus) {
        if(books.containsKey(bookId)) {
            System.out.println("Book ID must be unique!");
            return;
        }
        if(title.isEmpty() || author.isEmpty()) {
            System.out.println("Title and Author cannot be empty!");
            return;
        }
        if(!availabilityStatus.equals("Available") && !availabilityStatus.equals("Checked Out")) {
            System.out.println("Invalid availability status!");
            return;
        }
        books.put(bookId, new Book(bookId, title, author, genre, availabilityStatus));
        System.out.println("Book added successfully!");
    }
    
    public void viewAllBooks() {
        if(books.isEmpty()) {
            System.out.println("No books available!");
            return;
        }
        for(Book book: books.values()) {
            System.out.println(book);
        }
    }
    
    public void searchBook(String searchTerm) {
        for(Book book: books.values()) {
            if(book.getBookId().equals(searchTerm) || book.getTitle().equalsIgnoreCase(searchTerm)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book not found!");
    }
    
    public void updateBook(String bookId, String newTitle, String newAuthor, String newAvailabilityStatus) {
        Book book = books.get(bookId);
        if(book == null) {
            System.out.println("Book not found!");
            return;
        }
        
        if(!newTitle.isEmpty()) {
            book.setTitle(newTitle);
        }
        if(!newAuthor.isEmpty()) {
            book.setAuthor(newAuthor);
        }
        if(newAvailabilityStatus.equals("Available") || newAvailabilityStatus.equals("Checked Out")) {
            book.setAvailabilityStatus(newAvailabilityStatus);
        }
        else {
            System.out.println("Invalid availability status!");
            return;
        }
        System.out.println("Book details updated successfully!");
    }
    
    public void deleteBook(String bookId) {
        if(books.remove(bookId) != null) {
            System.out.println("Book deleted successfully!");
        }
        else {
            System.out.println("Book not found!");
        }
    }
}

public class DigitalLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManagementSystem library = new LibraryManagementSystem();
        
        while(true) {
            System.out.println("\nDigital Library - Book Management System");
            System.out.println("1. Add a Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID or Title");
            System.out.println("4. update Book Details");
            System.out.println("5. Delete a Book Record");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();   // Consume newline
            
            switch(choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Book Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter Availability Status (Available/Checked Out): ");
                    String availabilityStatus = scanner.nextLine();
                    library.addBook(bookId, title, author, genre, availabilityStatus);
                    break;
                case 2:
                    library.viewAllBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID or Title to search: ");
                    String searchTerm = scanner.nextLine();
                    library.searchBook(searchTerm);
                    break;
                case 4:
                    System.out.print("Enter Book ID to update: ");
                    String updatebookId = scanner.nextLine();
                    System.out.print("Enter New Title (or press Enter to skip): ");
                    String updatedTitle = scanner.nextLine();
                    System.out.print("Enter New Author (or press Enter to skip): ");
                    String updatedAuthor = scanner.nextLine();
                    System.out.print("Enter New Availability Status (Available/Checked Out): ");
                    String updatedBookStatus = scanner.nextLine();
                    library.updateBook(updatebookId, updatedTitle, updatedAuthor, updatedBookStatus);
                    break;
                case 5:
                    System.out.print("Enter Book ID to delete: ");
                    String deleteBookId = scanner.nextLine();
                    library.deleteBook(deleteBookId);
                    break;
                case 6:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                default:
                System.out.println("Invalid choice! Please try again.");
            }
            
        }
    }
}

