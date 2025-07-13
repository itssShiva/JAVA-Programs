import java.util.*;

public class Swapnumbers {
    public static void main(String[] args) 
    {
        System.out.println("Enter your first number: ");
        Scanner firstnumber=new Scanner(System.in);
        int a=firstnumber.nextInt();
        System.out.println("Enter your second number: ");
        Scanner secondnumber=new Scanner(System.in);
        int b=firstnumber.nextInt();
        int c=a;
        a=b;
        b=c;

System.out.println("First number:\n"+a);
System.out.println("Second number:\n"+b);
    
    }
}
               