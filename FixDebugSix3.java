import java.util.Scanner;

public class FixDebugSix3 {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int userNum, val;
      final int MIN = 1;
      final int MAX = 20;
      final int TIME_WASTER = 100000;

      System.out.print("Enter a number between " + MIN + " and " + MAX + " >> ");
      userNum = keyboard.nextInt();

      while(userNum < MIN || userNum > MAX) {
         System.out.println("Number out of range");
         System.out.print("Enter a number between " + MIN + " and " + MAX + " inclusive >> ");
         userNum = keyboard.nextInt();
      }

      for(val = userNum; val > 0; --val) {
         System.out.print(val + "  ");

         for(int x = 0; x < TIME_WASTER; ++x)
            for(int y = 0; y < TIME_WASTER; ++y)
               ; // Do-nothing loop to waste time
      }

      System.out.println("\nBlastoff!");
   }
}
