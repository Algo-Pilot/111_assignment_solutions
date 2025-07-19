//task 2
public class Cart {
    public String name = "";
    public String [] items = new String [3];
    public double [] prices = new double [3];
    public int itemCount = 0;
    public double discount = 0.0;
    public double totalPrice = 0.0;
    public void create_cart(int c) {
        this.name = name + c;
    }
    public void addItem(String item, double price) {
        if(itemCount < 3){
            items[itemCount] = item;
            prices[itemCount] = price;
            itemCount++;
            totalPrice = totalPrice + price;
            System.out.println(item + " added to cart "+ name);
            System.out.println("You have "+itemCount+" item(s) in your cart now.");
        }
        else {
            System.out.println("You already have 3 items on your cart");
        }
    }
    public void addItem(double price, String item) {
        if(itemCount < 3){
            items[itemCount] = item;
            prices[itemCount] = price;
            itemCount++;
            totalPrice = totalPrice + price;
            System.out.println(item + " added to cart "+ name);
            System.out.println("You have "+itemCount+" item(s) in your cart now.");
        } else {
            System.out.println("You already have 3 items on your cart");
        }
    }
    public void cartDetails(){
        System.out.println("Your cart(c"+name+") :");
        for(int i = 0; i < itemCount; i++) {
            System.out.println(items[i] + " - " + prices[i]);
        }
        System.out.println("Discount Applied: " + discount + "%");
        if(discount > 0) {
            double discountedPrice = totalPrice - (totalPrice * discount / 100.0);
            System.out.println("Total Price: " + discountedPrice);
        } else {
            System.out.println("Total Price: " + totalPrice);
        }
    }
    public void giveDiscount(double discount) {
        this.discount = discount;
    }
}
