import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=input.nextLine();
        System.out.println("Your String is  "+((IsPallindrome(str)? "Pallindrome": "Not Pallindrome")));

    }
    public static boolean IsPallindrome(String str){
        if (str.length()<=1) {
            return true;    
        }
        int lastpos=str.length()-1;
        if (str.charAt(0)!=str.charAt(lastpos)) {
            return false;
        }
        String newstr=str.substring(1,lastpos);
        return IsPallindrome(newstr);
    }
}
