//task3
public class Calculator {
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void multiply(int a, int b){
        System.out.println(a*b);
    }
    public void multiply(int a, int b,int c){
        System.out.println(a*b*c);
    }
    public void multiply(String a, int b){
        String s = "";
        for(int i = 1; i<= b; i++){
            if(i != b){
                s =s+a+"-";
            }
            else{
                s=s+a;
            }
        }
        System.out.println(s);
    }
}
