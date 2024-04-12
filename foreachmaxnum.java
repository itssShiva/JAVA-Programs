import java.util.Scanner;

public class foreachmaxnum {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array");
        Scanner input =new Scanner(System.in);
        int size =input.nextInt();
        System.out.println("Enter the elements of Array");
      int[] arr=new int[size];
      
int i=0;
while (i<arr.length) {
arr[i]=input.nextInt();
i++;
}
int max=Integer.MIN_VALUE;
for (int num : arr) {
  
    if (max<num) {
        max=num;
    }
   
}
System.out.println("Maximum Value is: "+max);
    }

    
}
