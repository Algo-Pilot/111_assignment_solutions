public class Student{
    String name = "Not set";
    String department = "CSE";
    double cgpa = 0.0;
    int credits = 9;
    String scholarship = "Not Set";
    public void updateDetails(String name, double cgpa,int credits){
        this.name = name;
        this.cgpa = cgpa;
        this.credits = credits;
    }
    public void updateDetails(String name, double cgpa,int credits,String department){
        this.name = name;
        this.cgpa = cgpa;
        this.credits = credits;
        this.department = department;
    }
    public void updateDetails(String name, double cgpa){
        this.name = name;
        this.cgpa = cgpa;
    }
    public void checkScholarshipEligibility(){
        if(cgpa >= 3.5 && cgpa<3.7 && credits>10 ){
            this.scholarship = "Need based scholarship";
            System.out.println(this.name + " is eligible for Need based scholarship");
        }else if(cgpa>= 3.7 && credits>10){
            this.scholarship = "Merit based scholarship";
            System.out.println(this.name + " is eligible for Merit based scholarship");
        }else{
            this.scholarship = "No scholarship";
            System.out.println(this.name + " is not eligible for scholarship");
        }
    }
    public void showDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Department: "+this.department);
        System.out.println("CGPA: "+this.cgpa);
        System.out.println("Credits: "+this.credits);
        System.out.println("Scholarship status: "+this.scholarship);
    }
}
