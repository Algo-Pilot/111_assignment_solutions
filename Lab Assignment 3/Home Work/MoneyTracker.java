//task 4
public class MoneyTracker {
    public String name;
    public double balance;
    public double income;
    public double expense;
    public String info(){
        return "Name: " + name + "\nCurrent Balance: " + balance ;
    }
    public void createTracker(String name) {
        this.name = name;
        this.balance = 1.0;
        this.income = 0.0;
        this.expense = 0.0;
    }
    public void income(double amount) {
        balance += amount;
        income += amount;
        System.out.println("Balance Updated!");
    }
    public void expense(double amount) {
        if (amount > balance) {
            System.out.println("Not enough balance.");
        }
        else if (amount == balance){
            System.out.println("You're broke!");
            expense = amount;
        }
        else{
            expense += amount;
            balance -= amount;
            System.out.println("Balance Updated!");
        }
    }
    public void showHistory() {
        System.out.println("Last added: " + income);
        System.out.println("Last spent: " + expense);
    }
}
