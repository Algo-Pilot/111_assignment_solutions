import java.util.Scanner;
public class task3_ut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if (num % 2 != 0) {
            int med = arr[num / 2];
            System.out.printf("The median is %d.", med);
        }
        else {
            int med = arr[num / 2] + arr[num / 2 - 1];
            System.out.printf("The median is %d.", med / 2);
        }
        sc.close();
    }
}