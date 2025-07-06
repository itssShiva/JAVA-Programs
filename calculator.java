import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.println("Enter first number : ");
       float num1=input.nextFloat();
        System.out.println("Enter second number : ");
       float num2=input.nextFloat();
        System.out.println("Enter 1 for add , 2 for subtract, 3 for multiply, 4 for divide : ");
        int choice=input.nextInt();
float result= switch(choice){
case 1 -> num1+num2;
case 2 -> num1-num2;
case 3 -> num1*num2;                
case 4 -> num1/num2;
default ->0;
};
System.out.println(result);

        
    }
    
}
