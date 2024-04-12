import java.util.Scanner;
public class positivenumsum {
    public static void main(String[] args) {
        System.out.println("Enter the no. of elements : ");
        Scanner input =new Scanner(System.in);
        int size=input.nextInt();
        System.out.println("Enter the numbers ");
       int i=0;
       int sum=0;
       int[] arr=new int[size];
        while (i<size) {
         arr[i]=input.nextInt();
         i++;
        }
        for (int num : arr) {
            if (num>0) {
                sum+=num;
            } else {
                continue;
            }
        }
        System.out.println("sum of numbers is : "+sum);
        }
       
        }
    
