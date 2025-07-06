import java.util.Scanner;

public class IsSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, n;
        System.out.println("Enter the size of Array");
        n = input.nextInt();
        int[] arr = new int[n];
        while (i < n) {
            System.out.println("Enter the element at " + i + " ");
            arr[i] = input.nextInt();
            i++;
        }
        boolean isinc = isinc(arr);
        boolean isdec = isdec(arr);
        if (isinc || isdec) {
            System.out.println("Your Array is Sorted");
        } else {
            System.out.println("Your Array is not Sorted");
        }
    }

    public static boolean isinc(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isdec(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
