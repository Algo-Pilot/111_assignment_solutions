public class Student {
    public int id;
    public double cgpa;
    public String[] course = new String [4];
    public int count = 0;
    public Student(int id){
        this.id =id;
        System.out.printf("A student with ID %d has been created.%n", id );
    }
    public Student(int id , double cgpa){
        this.id = id;
        this.cgpa = cgpa;
        System.out.printf("A student with ID %d and cgpa %.1f has been created.%n", this.id, this.cgpa);
    }
    public void storeID(int id){
        this.id =id;
    }
    public void storeCG(double cgpa){
        this.cgpa = cgpa;
    }
    public void removeAllCourse(){
        this.course = new String[4];
        this.count = 0;
    }
    public void addCourse(String course){
        if(this.cgpa > 0){
            if(this.count < 4){
                if(this.cgpa < 3.0 && this.count == 3){
                    System.out.printf("Failed to add %s%nCG is low. Can't add more than 3 courses.", course);
                }
                else{
                    this.course[this.count] = course;
                    this.count++;
                }
            }
        }
        else{
            System.out.printf("Failed to add %s%n", course);
            System.out.println("Set CG first");
        }
    }
    public void addCourse(String [] courses){
        int length = courses.length;
        if(this.cgpa > 3.0){
            boolean flag = false;
            if((count + length) > 4){
                flag = true;
            }
            int a = 0;
            for(int i = count; i < 4 && a < length; i++){
                this.course[i] = courses[a++];
                count++;
            }
            if(flag == true){
                System.out.print("Failed to add ");
                for(int i = a; i < length; i++){
                    if(i == (length - 1)){
                        System.out.println(courses[i]);
                    }
                    else{
                        System.out.print(courses[i] + " ");
                    }
                }
                System.out.println("Maximum 4 courses allowed.");
            }
        }
        else{
            boolean flag = false;
            if((count + length) > 3){
                flag = true;
            }
            int a = 0;
            for(int i = count; i < 3 && a < length; i++){
                this.course[i] = courses[a++];
                count++;
            }
            if(flag == true){
                System.out.print("Failed to add ");
                for(int i = a; i < length; i++){
                    if(i == (length - 1)){
                        System.out.println(courses[i]);
                    }
                    else{
                        System.out.print(courses[i] + " ");
                    }
                }
                System.out.println("Maximum 3 courses allowed.");
            }
        }
    }
    public void showAdvisee(){
        System.out.printf("Student ID: %d, CGPA: %.1f%n",this.id, this.cgpa);
        if(count == 0){
            System.out.println("No courses added.");
        }
        else{
            System.out.println("Added courses are:");
            for(int i = 0; i < count; i++){
                if(i == (count -1)){
                    System.out.println(this.course[i]);
                }
                else{
                    System.out.print(this.course[i] + " ");
                }
            }
        }
    }

}
