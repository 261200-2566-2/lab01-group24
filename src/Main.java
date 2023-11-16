import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void sorted(int[] a) {
        Arrays.sort(a);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your size : ");
        int number = s.nextInt();
        int[] x = new int[number];


        for (int i = 0; i < number; i++) {
            x[i] = s.nextInt();
        }
        sorted(x);
        for (int i : x
        ) {
            System.out.println(i);
        }

    }
}