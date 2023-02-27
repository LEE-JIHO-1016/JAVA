class Main {
  public static void main(String[] args) {
    //model
    int total = 1342;
    int gross=0;
    int dozen=0;
    int left=0;

    //control
    gross=total/144;
    dozen=(total%144)/12;
    left=(total%144)%12;

    //view


    System.out.println("Your number of eggs is "+ gross + " gross, " + dozen +" dozen, and " + left);
  }
}