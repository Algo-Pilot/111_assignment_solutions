public class Book {
    public String title;
    public String author;
    public String genre;
    public int pages;
    public void createBook(String title){
        this.title = title;
        this.author = "Unknown";
        this.genre = "Unknown";
        this.pages = 0;
    }
    public void createBook(String title, String author){
        this.title = title;
        this.author = author;
        this.genre = "Unknown";
        this.pages = 0;
    }
    public void createBook(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = 0;
    }
    public void customizeGenre(String genre){
        this.genre = genre;
        System.err.printf("Updated genre of \"%s\" to %s.%n", this.title, this.genre);
    }
    public void customizePages(int pages){
        this.pages = pages;
        System.out.printf("Updated pages of \"%s\" to %d pages.%n", this.title, this.pages);
    }
    public void displayDetails(){
        System.out.printf("Title: %s, Author: %s, Genre: %s, Pages: %d%n",this.title, this.author,this.genre, this.pages);
    }
}
