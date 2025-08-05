public class Player {
    public String name;
    public int age;
    public int matches;
    public Player(String name, int age, int matches){
        this.name = name;
        this.age = age;
        this.matches = matches;
    }
    public void printinfo(){
        System.out.printf("Name: %s%nAge: %d, Total Matches: %d%n", this.name, this.age, this.matches);
    }
}
