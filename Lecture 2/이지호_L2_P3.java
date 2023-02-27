import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Model
    //-define a variable of user's name
    String usersname="";
    //-define a variable of uppercase
    String uppercase="";

    //Control
    //-receive user's name
    usersname=(new Scanner(System.in)).nextLine();
    //-convert into uppercase
    uppercase=usersname.toUpperCase();

    //View
    //-Greeting
    System.out.println("Hello world!"+uppercase);
  }
}