
public class Fourth {
    public static void print() {
        int arraySize = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                arraySize++;
            }
        }
        System.out.println("Array:");
        int[] num = new int[arraySize];
            for (int i = 1,w=0; i <= 99; i++) {
                if (i % 2 != 0) {
                    num[w] = i;
                    System.out.print(num[w] + " ");
                    w++;}
            }

        System.out.println("\nReverse array:");
        for (int i = arraySize - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
        System.out.println("\n------------------------------------------------");
    }
}
