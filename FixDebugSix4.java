import java.util.Scanner;

public class FixDebugSix4 {
   public static void main(String[] args) {
      int high, low;
      int howManyBetween;
      double half, midPoint;
      Scanner input = new Scanner(System.in);

      System.out.print("Enter a number >> ");
      low = input.nextInt();  // ✅ Fixed typo here

      System.out.print("Enter a larger number >> ");
      high = input.nextInt();

      while(high <= low) {  // ✅ Fixed logic: repeat if high is not greater than low
         System.out.println("The number you entered for a high number, " +
            high + ", is not more than " + low);
         System.out.print("Enter a number higher than " + low + " >> ");
         high = input.nextInt();
      }

      howManyBetween = high - low;
      half = howManyBetween / 2.0; // ✅ Make sure it's double division
      midPoint = low + half;

      System.out.println(midPoint + " is halfway between " + low + " and " + high);
   }
}
