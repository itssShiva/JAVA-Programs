import java.util.Scanner;

public class Guessthenumber {
    public static void main(String[] args) {
        int random=(int)(Math.random()*101);
        int guess ;
        int chance=0;
do {
    System.out.println("Guess the number  between 1 to 100");
    Scanner input =new Scanner(System.in);
    
     guess=input.nextInt();
     chance++;
    if (guess>random) {
        System.out.println("Number is lower than "+guess);
    }
    else if(guess<random){
        System.out.println("Number is greater than "+guess);
    } 
} while(guess!=random);

    System.out.println("woohooo!! You guessed it right");
    System.out.println("you made it in "+chance+" chances");

    }
    
}
