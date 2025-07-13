import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args) {
        System.out.println("Enter the nmber upto which you want to print fibonacci series: ");
      Scanner input=new Scanner(System.in);
      int limit=input.nextInt();
      for(int i=1;i<=limit;i++)
      {
        System.out.println(fibonacciseries(i)+" ");
      }
    }

public static int fibonacciseries(int position)
{
if (position==1) {
    return 0;
}
if (position==2) {
    return 1;    
}
return (fibonacciseries(position-1)+fibonacciseries(position-2));
}
}
