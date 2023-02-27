/*
//Problem#3-7
class Main
{
  public static void main(String[] args)
  {
    int[] dayFound = new int[366]; for(int i=0;i<=365;i++)dayFound[i]=0;
    boolean loop = true;
    
    //sub problem 2)
    for(int i=0; i<365; i++)
    {
      int birthday = (int)(Math.random()*365);
      dayFound[birthday]++;
    }
    int countBirthday=0;
    for(int i=0;i<365;i++)
    {
      if(dayFound[i]>0)
      {
        countBirthday++;
        System.out.println(countBirthday);
      }
    }
    
    System.out.println(countBirthday);
    */


   /*sub problem 1
   while(loop)
    {
      int birthday = (int)(Math.random()*365)+1;
      dayFound[birthday]++;
      if(dayFound[birthday]==2)
      {
        System.out.println(birthday);
        loop=false;
      }
    }
    */
  }
}



/*
//Problem#3-6
class Main
{
  public static void main(String[] args)
  {
    int[] liD=new int[10000]; for(int i=0;i<10000;i++)liD[i]=0;
    int maxnD=0;
    for(int i=1;i<=10000;i++)
    {
      int nD=0;
      for(int j=1;j<=i;j++){if(i%j==0) nD++;}
      if(nD>=maxnD) {maxnD=nD;liD[i]=nD;}
    }
    for(int i=0;i<10000;i++)
     if(liD[i]>0)
       System.out.println(i+" "+liD[i]);
     
  }
}
*/


/*
//Problem #3-5
import java.io.File;
import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    try
    {
      File path = new File("/home/runner/L3-2/data.txt");
      Scanner line = new Scanner(path);

      double sum = 0.0;
      while(line.hasNextLine())
      {
        //System.out.println(line.nextLine());
        String input = line.nextLine();
        int i = input.indexOf(":");
        String city = input.substring(0,i);
        String number = input.substring(i+1,input.length());
        try{sum+=Double.parseDouble(number);}
        catch(Exception e){System.out.println(city+":"+number);}
      }
      System.out.println(sum);
    }
    catch(Exception e){}
  }
}
*/


/*
//Problem #3-4
class Main {
  public static void main (String [] args) {
    String input = "He said,\"That\'s not a good idea.\"";
    System.out.println(input);
    for(int i=0;i<input.length();i++)
    {
      if(Character.isLetter(input.charAt(i))) System.out.print
      (input.charAt(i));
      else if (input.charAt(i)==' ') System.out.println("");
      else if (input.charAt(i)=='\'') System.out.println("");
      else if(input.charAt(i)=='\"') System.out.println("");
      else{}
    }
  }
}
*/

/*
//Problem #3-3
import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    double first = Double.parseDouble((new Scanner(System.in)).nextLine());
    String operation = (new Scanner(System.in)).nextLine();
    double second = Double.parseDouble((new Scanner(System.in)).nextLine());
    switch(operation)
    {
      case "+": System.out.println(first+second); break;
      case "-": System.out.println(first-second); break;
      case "*": System.out.println(first*second); break;
      case "/": System.out.println(first/second); break;
    }
  }
}
*/

/*
//Problem #3-2
class Main
{
  public static void main(String[] args)
  {
    int maxnDivisor = 0;
    for(int i=1;i<=10000;i++)
    {
      int nDivisor = 0;
      for(int j=1;j<=i;j++)
      {
        if(i%j==0) nDivisor++;
      }
      if(maxnDivisor<nDivisor) maxnDivisor=nDivisor;
    }
    System.out.println(maxnDivisor);
  }
}
*/


/*
//Problem #3-1
class Main {
  public static void main(String[] args) {

    // Model - 초기화, 초기 입력정보
    int die1 = 0;
    int die2 = 0;
    boolean keepgoing = true;
    int count = 0;
    // Control - Simulate rollings

    while(keepgoing)
    {
      count++;
      //roll two dices
      die1 = (int)(Math.random()*6)+1;
      die2 = (int)(Math.random()*6)+1;
      if( (die1==1) && (die2==1)){

        keepgoing=false;
      }
    }
    // View - Report the number of rolls
    System.out.println(count);
  }
}
*/