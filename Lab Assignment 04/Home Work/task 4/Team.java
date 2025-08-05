public class Team {
    public String name;
    public Player [] players;
    public int count = 0;
    public Team(){
        players = new Player[10];
    }
    public Team(String name){
        this.name = name;
        players = new Player[10];
    }
    public void updateName(String name){
        this.name = name;
    }
    public void addPlayer(Player player){
        players[count++] = player;
    }
    public void printDetail(){
        System.out.printf("Team: %s%nList of players:%n", this.name);
        for(int i = 0; i < count; i++){
            players[i].printinfo();
        }
    }
}
