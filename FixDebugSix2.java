import java.util.Scanner;
public class FixDebugSix2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, denom, result;
        
        try {
            System.out.print("Enter numerator >> ");
            num = input.nextInt();
            System.out.print("Enter denominator >> ");
            denom = input.nextInt();
            result = num / denom;
            System.out.println(num + " / " + denom + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error");
        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            input.close();
        }
    }
}
