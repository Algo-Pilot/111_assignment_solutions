import java.util.ArrayList;
public class Movie {
    ArrayList<String> actors = new ArrayList<String>();
    public String title;
    public String director;
    public double rating;
    public void setMovieDetails(String title, String director, double rating){
        this.title = title;
        this.director = director;
        this.rating =rating;
    }
    public void setMovieDetails(String title, String director){
        this.title = title;
        this.director = director;
    }
    public void addActors(String ac1, String ac2){
        actors.add(ac1);
        actors.add(ac2);
        System.out.printf("Added actor \"%s\" to \"%s\".%n", ac1, this.title);
        System.out.printf("Added actor \"%s\" to \"%s\".%n", ac2, this.title);
    }
    public void addActors(String ac){
        actors.add(ac);
        System.out.printf("Added actor \"%s\" to \"%s\".%n", ac, this.title);
    }
    public void addActors(String ac1, String ac2, String ac3){
        actors.add(ac1);
        actors.add(ac2);
        actors.add(ac3);
        System.out.printf("Added actor \"%s\" to \"%s\".%n", ac1, this.title);
        System.out.printf("Added actor \"%s\" to \"%s\".%n", ac2, this.title);
        System.out.printf("Added actor \"%s\" to \"%s\".%n", ac3, this.title);
    }
    public void showInfo(){
        String act = "";
        System.out.printf("Title: %s %nDirector: %s %nRating: %.1f%n", this.title, this.director, this.rating);
        for(int i = 0; i< actors.size(); i++){
            if(i != (actors.size() -1)){
                act = act + actors.get(i) +", ";
            }
            else{
                act = act + actors.get(i);
            }
        }
        System.out.println("Actors: "+ act);
    }
    public void updateRating(double rating){
        this.rating = rating;
        System.out.printf("Updated rating of \"%s\" to %.1f", this.title, rating);
    }
}
