import java.util.Scanner;

public class passwordchecker {
    public static void main(String[] args) {
        String password;
       
        do{
            System.out.println("Enter a password");
         Scanner r=new  Scanner(System.in);
            password=r.nextLine();
            if (!isvalidPassword(password)) 
            {
             System.out.println("Your passsword is not valid .please Try again!!!");   
            }
        }
        while(!isvalidPassword(password));
    System.out.println("your password is valid ");
   
    }
    public static boolean isvalidPassword(String password)
    {
            boolean hasUppercase = false;
            boolean hasSpecialSymbol = false;
    
            if (password.length() <= 6) {
                return false;
            }
    
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                }
                if (!Character.isLetterOrDigit(c)) {
                    hasSpecialSymbol = true;
                }
            }
    
            return hasUppercase && hasSpecialSymbol;
        
    }
}
