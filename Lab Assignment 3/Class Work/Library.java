import java.util.ArrayList;
public class Library {
    private int capacity;
    private ArrayList<String> books;

    public Library() {
        books = new ArrayList<>();
    }
    public void setBookCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void addBook(String bookName) {
        if (books.size() < capacity) {
            books.add(bookName);
            System.out.println("Book '" + bookName + "' added to the library");
        } else {
            System.out.println("Exceeds maximum capacity. You can't add more than " + capacity + " books");
        }
    }
    public void printDetail() {
        System.out.println("Maximum Capacity: " + capacity);
        System.out.println("Total Books: " + books.size());
        System.out.println("Book list:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}
