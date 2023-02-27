import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //model
    String username = "";
    String first = "";
    String last ="";
    int i =0;

    //control
    System.out.println("Plese enter your first name and last name, seperated by a space : ");
    username = (new Scanner(System.in)).nextLine();
    i = username.indexOf(' ');
    first = username.substring(0,i);
    last = username.substring(i+1,username.length());


    //view
    System.out.println("Your first name is "+first+" , which has "+first.length()+" characters.");
    System.out.println("Your last name is "+last+" , which has "+last.length()+" characters.");
    System.out.println("Your initials are "+first.charAt(0)+last.charAt(0)+".");
  }
}