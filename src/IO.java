import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by jtormoehlen on 14.06.2021.
 */
public class IO {

    public static void main(String[] args) {
//        print(readInts());
//        println("");
        print(randomInt(1) + "");
    }

    public static void print(String s) {
        System.out.print(s);
    }

    public static void println(String s) {
        System.out.println(s);
    }

    public static void print(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            print(intArray[i] + " ");
        }
    }

    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.close();

        return i;
    }

    public static float readFloat() {
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        scanner.close();

        return f;
    }

    public static char readChar() {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        scanner.close();

        return c;
    }

    public static String readString() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        return s;
    }

    public static int[] readInts() {
        List<Integer> intList = new ArrayList();
        Scanner lineScanner = new Scanner(new Scanner(System.in).nextLine());

        while(lineScanner.hasNextInt()) {
            intList.add(lineScanner.nextInt());
        }
        lineScanner.close();
        int[] intArray = intList.stream().mapToInt(i->i).toArray();

        return intArray;
    }

    public static int randomInt(int upperBound) {
        return new Random().nextInt(upperBound + 1);
    }

    public static float randomFloat() {
        return new Random().nextFloat();
    }
}
