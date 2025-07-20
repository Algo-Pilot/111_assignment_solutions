import java.text.DecimalFormat;

public class Shape{
    public String name;
    public double area;
    public void setParameters (String s , double n){
        this.name = s;
        this. area = Math.PI * n * n;
    }
    public void setParameters(String s, int n1, int n2 ){
        this.name = s;
        this.area = 0.5 * n1 * n2;
    }
    public void setParameters (String s, double n, double n_n){
        this.name = s;
        this.area = n * n_n;
    }
    public String details (){
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedValue = df.format(area);
        String c = "Shape Name: " + name + "\nArea: "+ formattedValue;
        return c;
    }
}