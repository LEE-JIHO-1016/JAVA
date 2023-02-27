import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Model
    //-Declare the variables
    double dollars=0;
    int quarters=0;
    int dimes = 0;
    int nickels=0;
    int penny=0;

    //Control
    //-Ask coins
    System.out.print("How many QUARTERS do you have? ");
   quarters = Integer.parseInt((new Scanner(System.in)).nextLine());
    System.out.print("How many DIMES do you have? ");
   dimes = Integer.parseInt((new Scanner(System.in)).nextLine());
    System.out.print("How many NICKELS do you have? ");
   nickels = Integer.parseInt((new Scanner(System.in)).nextLine());
    System.out.print("How many PENNY do you have? ");
   penny = Integer.parseInt((new Scanner(System.in)).nextLine());
    //-Compute the total in dollars
    dollars= quarters * 0.25+
             dimes * 0.10 +
             nickels * 0.05 +
             penny * 0.01;


    //View
    //Display the result
    System.out.println("You have "+dollars+" dollars.");
  }
}