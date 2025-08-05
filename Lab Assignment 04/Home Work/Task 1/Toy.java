//task 01
public class Toy{
    public String name;
    public int price;
    public Toy(String name, int price){
        this.name = name;
        this.price = price;
        System.out.println("A new toy has been made!");
    }
    public void updatePrice(int price){
        this.price = price;
    }
    public void updateName(String name){
        System.out.printf("Changing old name: %s%n", this.name);
        this.name =name;
        System.out.printf("new name: %s%n", this.name);

    }
    public void showPrice(){
        System.out.printf("price: %d Taka%n", this.price);
    }
}