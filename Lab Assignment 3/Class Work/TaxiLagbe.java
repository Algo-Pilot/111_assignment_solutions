import java.util.ArrayList;
public class TaxiLagbe {
    private String taxiNumber;
    private String area;
    private int passengerCount;
    private int totalFare;
    private ArrayList<String> passengerList;
    public TaxiLagbe() {
        passengerCount = 0;
        totalFare = 0;
        passengerList = new ArrayList<>();
    }
    public void storeInfo(String taxiNumber, String area) {
        this.taxiNumber = taxiNumber;
        this.area = area;
    }
    public void addPassenger(String name, int fare) {
        if (passengerCount < 4) {
            System.out.println("Dear " + name + "! Welcome to TaxiLagbe");
            passengerList.add(name);
            passengerCount++;
            totalFare += fare;
        } else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }
    public void addPassenger(String name1, int fare1, String name2, int fare2) {
        addPassenger(name1, fare1);
        if (passengerCount < 4) { // only add second if there is space
            addPassenger(name2, fare2);
        }
    }
    public void printDetails() {
        System.out.println("Taxi number: " + taxiNumber);
        System.out.println("This taxi can cover " + area + " area");
        System.out.println("Total Passenger: " + passengerCount);
        System.out.print("Passenger Lists:\n");
        for (String name : passengerList) {
            System.out.println(name);
        }
        System.out.println("Total collected fare: " + totalFare + " Taka");
    }
}