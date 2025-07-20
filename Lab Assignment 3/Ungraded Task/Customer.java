//task2
public class Customer{
    public String name;
    public int size = 4;
    public int total_items = 0;
    public int [] pricelist = new int[size];
    public String [] itemStrings = new String[size];
    public int price = 0;
    public void createCustomer(String name){
        this.name = name;
    }
    public void addItem(String item, int price){
        if((total_items + 1)> size){
            System.out.println("Cart is full");
        }
        else{
            pricelist[total_items] = price;
            itemStrings[total_items] = item;
            total_items++;
            System.out.printf("%s added to cart%n", item);
        }
    }
    public void addItem(String item1, int price1, String item2, int price2){
        if((total_items + 2)> size){
            System.out.println("Cart is full");
        }
        else{
            pricelist[total_items] = price1;
            pricelist[total_items + 1] = price1;
            itemStrings[total_items] = item1;
            itemStrings[total_items + 1] = item2;
            total_items+=2;
            System.out.printf("%s and %s added to cart%n", item1,item2);
        }
    }
    public void showCart(){
        if(total_items >0){
            System.out.printf("Customer: %s%n", this.name);
            for(int i = 0; i < total_items; i++){
                System.out.printf("Item: %s Price: %d%n", itemStrings[i], pricelist[i]);
            }
        }
    }
    public void calculatePrice(){
        for(int i = 0; i < total_items; i++){
            this.price = price + this.pricelist[i];
        }
        System.out.println("Total: "+this.price);
    }
}