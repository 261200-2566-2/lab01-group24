import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // This methode for get integers from user.
    public static int[] ImportIntegers(){
        Scanner s = new Scanner(System.in);

        // Gets a non-negative integer n.
        int n;
        do { // do-while loop until n is non-negative integer.
            System.out.print("How many integers(n): ");
            n = Integer.parseInt(s.nextLine());
            if(n < 0) System.out.println("Must be non-negative integer.");
        }while (n < 0);

        // Gets n integers each on its own line.
        int[] intArr = new int[n];
        System.out.println("Insert Integers: ");
        for(int i = 0; i < n; i++){
            intArr[i] = Integer.parseInt(s.nextLine());
        }

        return intArr;
    }

    public static void main(String[] args) {
        int[] arr = ImportIntegers();

        // Print these n integers in a sorted order (ascending).
        Arrays.sort(arr);
        System.out.println("Sorted Integers:");
        for (int i: arr) {
            System.out.println(i);
        }
    }
}
