import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = 0, b = 1, c;
        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int data = scn.nextInt();
        for (int i = 2; i <= data; i++) {
            c = a + b;
            System.out.println(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}
