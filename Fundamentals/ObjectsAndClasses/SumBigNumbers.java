package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNumb = new BigInteger(scanner.nextLine());
        BigInteger secondNumb = new BigInteger(scanner.nextLine());

        BigInteger sum = firstNumb.add(secondNumb);
        System.out.println(sum);

    }
}
