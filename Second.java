import java.math.BigInteger;
import java.util.Scanner;

public class Second {

    public static void print()
    {
        System.out.println("2.For loop. Factorial");
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
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
