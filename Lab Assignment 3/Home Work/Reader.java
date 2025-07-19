public class Reader {
    public String name;
    public int capacity;
    public String[] books;
    public int bookCount;
    public String createReader(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.books = new String[capacity];
        this.bookCount = 0;
        return "A new reader is created!";
    }
    public void readerInfo() {
        System.out.println("Name: "+ name);
        System.out.println("Capacity: " + capacity);
        if(bookCount == 0){
            System.out.println("No books added yet.");
        }
        else{
            System.out.println("Books: ");
            for(int i = 0; i < bookCount; i++) {
                System.out.println("book " + (i + 1) + ": " + books[i]);
            }
        }
    }
    public void addBook(String book) {
        if(bookCount < capacity) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("No more capacity");
        }
    }

}
