import java.math.BigInteger;
import java.util.Scanner;

public class Third {
    public static void print()
    {
        System.out.println("3.While loop. Printing odd numbers between 1 and 99:");
        int i=1;
        while(i <= 99){
            if( i % 2 != 0){
                System.out.print(i + " ");
            }
            i++;}

        System.out.println("\n3.While loop. Factorial");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number whose factorial is to be found: ");
        int n = scanner.nextInt();
        BigInteger result = factorial(n);
        System.out.println(n + "!=" + result);
        System.out.println("---------------------------------------");
    }
    public static BigInteger factorial(int n) {
        if(n < 0){
            throw new IllegalArgumentException("Value must be positive");
        }
        BigInteger result = BigInteger.ONE;
        int i =2;
        while(i <= n)
        {
            result = result.multiply(BigInteger.valueOf(i));
            i++;
        }

        return result;
    }
}
