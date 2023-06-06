package day4;

public class Age {

    public static void main(String[] args) {
      int number=25;
      if(number>=13 && number<=19) {
          System.out.println("teen");
      }
      else if (number<13) {
          System.out.println("Kid");

      }
      else{
          System.out.println("Adult");
      }
    }
}
