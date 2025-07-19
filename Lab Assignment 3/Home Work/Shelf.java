//task 01
public class Shelf {
    public int capacity = 0;
    public int bookcount = 0;
    public void addBooks(int num){
        if(capacity == 0){
            System.out.println("Zero capacity. Cannot add books.");
        }
        else if(bookcount + num <= capacity){
            System.out.println(num + " books added to shelf");
            bookcount += num;
        }
        else{
            System.out.println("Exceeds capacity");
        }
    }
    public void showDetails(){
        System.out.println("Shelf capacity: " + capacity);
        System.out.println("Number of books: " + bookcount);
    }
}
