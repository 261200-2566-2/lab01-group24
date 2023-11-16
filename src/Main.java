import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] ImportIntegers(){
        int n;
        Scanner s = new Scanner(System.in);

        do {
            System.out.print("How many integers(n): ");
            n = Integer.parseInt(s.nextLine());
            if(n < 0) System.out.println("Must be non-negative integer.");
        }while (n < 0);

        int[] intArr = new int[n];
        System.out.println("Insert Integers: ");

        for(int i = 0; i < n; i++){
            intArr[i] = Integer.parseInt(s.nextLine());
        }

        return intArr;
    }

    public static void main(String[] args) {
        int[] arr = ImportIntegers();
        Arrays.sort(arr);
        System.out.println("Sorted Integers:");
        for (int i: arr) {
            System.out.println(i);
        }
    }
}
