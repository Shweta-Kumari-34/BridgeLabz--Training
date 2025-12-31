import java.util.Scanner;

public class FestivalLuckyDraw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("**********************************************");
        System.out.println("===== Welcome To Festival Lucky Draw =====");

        while(true){
            System.out.println("Please enter a positive number (or 0 to exit): ");
            int number = input.nextInt();

            if(number == 0){
                System.out.println("Thank you for participating!");
                break;                }
            else if(number < 0){
                System.out.println("Please enter a valid positive number!");
            }
            else if(number % 3 == 0 && number % 5 == 0){
                System.out.println("Hurrah! You Won A Gift!");
            }
            else{
                System.out.println("Oops!! Better Luck Next Time.");
            }

            System.out.println("**********************************************");
        }

        input.close(); // <-- now this is reachable
    }
}




