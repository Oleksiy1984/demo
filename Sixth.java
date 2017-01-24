import java.util.concurrent.ThreadLocalRandom;

public class Sixth {
    public static void print()
    {

        int [][]array = new int[8][5];

        System.out.println("6. Random array 8x5");
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random()*90+10);
                //array[i][j] = ThreadLocalRandom.current().nextInt(10, 99 + 1);
                System.out.print(array[i][j]+"   ");
            }
            System.out.println();
        }

    }
}
