
public class First {

    public static void print()
    {
        System.out.println("1. For loop. Printing odd numbers between 1 and 99:");
        for(int i=1; i <= 99; i++){
            if( i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("\n------------------------------------------------");
    }

}

