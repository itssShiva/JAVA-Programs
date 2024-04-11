import java.util.Scanner;

public class table2 {
    public static void main(String[] args) {
        System.out.print("Enter the number");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int table=0;
for(int i=1;i<=10;i++)
{
 table=num*i;
 System.out.println(table);
}    

    }
}
