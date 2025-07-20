import java.util.ArrayList;
public class Course {
    public String name;
    public String code;
    ArrayList<String> content =  new ArrayList<>();
    public void updateDetails(String name, String code){
        this.name = name;
        this.code = code;
    }
    public void printDetails(){
        String con ="";
        System.out.printf("Course details: %nCourse Name: %s %nCourse Code: %s %nCourse Syllabus:%n", this.name, this.code);
        if(content.size()==0){
            System.out.println("No content yet.");
        }
        else{
            for(int i =0; i < content.size(); i++){
                if(i == (content.size()-1)){
                    con = con + content.get(i);
                }
                else{
                    con = con + content.get(i)+", ";
                }
            }
        }
        System.out.println(con);
    }
    
}
