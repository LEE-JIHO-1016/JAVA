
//Lecture6

/*
public class Main{
  public static void main(String[] args){
    int[][] A={
      {13,7,33,54,-5,-1,92},
      {-3,0,8,42,18,0,67},
      {44,78,90,79,-5,72,22},
      {43,-2,17,100,1,-12,12},
      {2,0,58,58,36,21,87}
    };

    for(int i=0;i<5;i++){
      for(int j=0;j<7;j++){
        for(int j=0;j<7;j++)
          System.out.print(A[i][j]+" ");
        System.out.println("");
      }
      //store = 5, month= 7
      double julyProfit=0.0;
      for(int storeNum=0;storeNum<5; storeNum++){
        julyProfit+=A[storeNum][6];
      }
      System.out.println("JulyProfit= "+julyProfit);

      double TotalProfit=0.0;
      for(int storenum=0;storeNum<5;storeNum++){
        for(int month=0;[storeNum][month];
        }
      }
      System.out.println("TotalProfit ="+TotalProfit);
    }
  }
}
*/

/*
import java.util.Scanner;
import java.util.ArrayList;
class Main{
  public static void main(String[] args){
    //ArrayList<Integer> list = new ArrayList<Integer>();
    int [] list =new int[100];
    int index= 0;
    System.out.println("Enter some non-zero integers, Enter 0 to end.");
    while(true){
      System.out.print("?");
      int number = Integer.parseInt((new Scanner(System.in)).nextLine());
      if (number==0) break;
      list[index]=number;
      index++;
    }
    System.out.println();
    System.out.println("Your number in reverse are: ");
    for(int i=index; i>=0;i--){
      System.out.println(list[i]);
    }
  }
}
*/

//lecture6-1
/*
class Main{
  public static void main(String[] args){
    int[] checklist = new int[365];
    for(int i=0;i<365;i++) checklist[i]=0;
    int count = 0;

    while(true){
      int birthday = (int)(Math.random()*365);
      count++;

      System.out.printf("Person %d has birthday number %d",count,birthday);
      System.out.println();

      if(checklist[birthday]>=2){
        break;
      }
      checklist[birthday]++; //=true->++
    }
    System.out.println();
    System.out.println("A Duplicate birthday was found after"+count+"tries.");
  }
}
*/

/*
class Main{
  public static void main(String[] args){
    Vehicle v1= new Vehicle();
    Car c1 = new Car();
    Truck t1 = new Truck();

    System.out.println(v1.toString());

  }
}
*/
/*
class Vehicle{
  int registerationNumber;
  Person owner;
  void transferOwnership(Person newOwner){}
}
class Car extends Vehicle{int numberOfDoors;}
class Truck extends Vehicle{int numberOfAxles;}
class Motorcycle extends Vehicle(boolean hasSidecar;)
class Person{}
*/



/*
class Main{
  public static void main(String[] args){
    Student std, std1, std2, std3;
    std = new Student();
    std1 = new Student();
    std2 = std;
    std3 = null;
    std.name="John Smith";
    std1.name="Mary Jones";

    System.out.println(std.name);
    System.out.println(std1.name);
    System.out.println(std2.name);
    //System.out.println(std3.name);
  }
}
*/
/*
class Student{
  String name = "";
  int test1 = 0;
  int test2 = 0;
  int test3 = 0;
  int getAverage(){return(test1+test2+test3)/3;}
}
*/
/*
//Lecture4 Example2
class Main
{
  public static void main(String[] args){
    String input = "34A7";
    int value = 0;
    for (int i=0; i<input.length();i++)
      value = value*16 + hexValue(input.charAt(i));
    System.out. println(value);
  }
public static int hexValue(char input){
  switch(input){
    case '0': return 0;
    case '1': return 1;
    case '2': return 2;
    case '3': return 3;
    case '4': return 4;
    case '5': return 5;
    case '6': return 6;
    case '7': return 7;
    case '8': return 8;
    case '9': return 9;
    case 'A': return 10;
    case 'B': return 11;
    case 'C': return 12;
    case 'D': return 13;
    case 'E': return 14;
    case 'F': return 15;
    default : return 0;
  }
}
}
*/






//Lecture4 ex1
/*
class Main {
  public static void main(String[] args) {
    System.out.println("Now is the time to act!");
    printCapitalized("Now is the time to act!");
  }
  public static void printCapitalized(String input){
    char prev=' ';
    for (int i=0; i<input.length(); i++)
    {
      char curr = input. charAt(i);
      if(Character.isLetter(curr)&& !Character.isLetter(prev)
      )
      System.out.print(Character.toUpperCase(curr));
      else
        System.out.print(curr);
      prev=curr;
    }
  }

}
*/
