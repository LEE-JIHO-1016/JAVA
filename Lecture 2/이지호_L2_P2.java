class Main {
  public static void main(String[] args) {
    //Model => Variable decleration
    int first=0;
    int second=0;
    int sum=0;
    // Control==> Generate die data and Calculate the output
    first=(int)(Math.random()*6)+1;
    


    // View=> Printing all results
    System.out.println("The first die comes up"+first);
    System.out.println("The second die comes up"+second);
    System.out.println("Your total roll is"+sum);
  }
}