import java.util.Scanner;
public class task2_cw{
    public static void main(String [] args){
        Scanner sc =  new Scanner (System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String concat = s1 + " "+s2;
        int sum = 0;
        for(int i = 0; i < concat.length(); i++){
            int a = concat.charAt(i);
            if((a >= 65 && a<=90) || (a>=97 && a<=122)){
                sum += a;
            }
        }
        System.out.println(concat);
        System.out.println(sum);
        sc.close();
    }
}