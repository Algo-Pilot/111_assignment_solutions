import java.util.Scanner;
public class task_2_previous_alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String n = "";
        for(int i = 0; i < s.length(); i++){
            int c = s.charAt(i) -1;
            if (c == 96){
                c = 122;
            }
            char chr = (char) c;
            n += chr;
        }
        System.out.println(n);
    }
}
    