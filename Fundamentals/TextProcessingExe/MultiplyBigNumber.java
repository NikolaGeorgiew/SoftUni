package TextProcessingExe;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNumb = new BigInteger(scanner.nextLine());
        BigInteger secondNumb = new BigInteger(scanner.nextLine());

        System.out.println(firstNumb.multiply(secondNumb));
    }
}
