import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        ProcessNumber newNumber = new ProcessNumber();
        System.out.println(" Fizz Buzz program.");
        System.out.println(" For any given integer it returns:");
        System.out.println(" - String 'Fizz' if a given number divides by 3");
        System.out.println(" - String 'Buzz' if a given number divides by 5");
        System.out.println(" - String 'FizzBuzz' if a given number divides by 3 and 5");
        System.out.println(" - String with the same integer in any other cases\n\n");

        boolean play = true;
        while (play){
            System.out.print(" Your integer: ");
            Scanner yourInput = new Scanner(System.in);
            int yourNumber = 0;
            try{
                yourNumber = yourInput.nextInt();
            }
            catch(Exception e){
                System.out.println(" Your input is not a number. Try again or enter STOP to quit.");
                yourInput.reset();
                Scanner yourInputOnFail = new Scanner(System.in);
                String confirmation = yourInputOnFail.nextLine();
                if(confirmation.equals("STOP")) {
                    play = false;
                    break;
                }
                continue;
            }
            finally {
                String result = newNumber.processNumber(yourNumber);
                System.out.println(result);
            }
        }
    }
}