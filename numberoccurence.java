import java.util.Scanner;

public class numberoccurence {
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
        System.out.println("Enter the number whose occurrence you want to check:  ");
        int num = input.nextInt();
        int occurrence = noofoccurrence(arr, num);
        System.out.println("Your element is found " + occurrence + " times in the array");
    }
    public static int noofoccurrence(int[] arr, int num) {
        int occ = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
