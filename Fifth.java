
public class Fifth {
    public static void print()
    {
        System.out.println("5. 20 Fibonacci numbers:");

                    int [] Fib = new int [20];
                    Fib[0]=1;
                    Fib[1]=1;
                    System.out.print(Fib[0]+" "+Fib[1]+" ");
                    for (int i=2;i<Fib.length;i++)
                    {
                        Fib[i]=Fib[i-1]+Fib[i-2];
                        System.out.print(Fib[i]+" ");
                    }

        System.out.println("\n------------------------------------------------");

    }
}
