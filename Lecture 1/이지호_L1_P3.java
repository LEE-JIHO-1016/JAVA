import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("What is your firstname?");
    String firstname = (new Scanner
    (System.in)).nextLine();
    System.out.println("What is your surname?");
    String surname= (new Scanner(System.in)).nextLine();
    System.out.println("Hello, "+firstname+" "+surname);
  }
}