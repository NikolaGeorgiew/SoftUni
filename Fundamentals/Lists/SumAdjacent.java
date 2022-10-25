package Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacent {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        for (int i = 0; i < numbers.size() - 1; i++) {
            double firstNumber = numbers.get(i);
            double secondNumber = numbers.get(i + 1);
            if (firstNumber == secondNumber) {
                numbers.set(i,firstNumber + secondNumber);
                numbers.remove(i + 1);
                i = -1;
            }

        }
        printList(numbers, " ");
    }
    private static void printList(List<Double> numbers, String delimiter) {
        String text = "";
        for (double numb: numbers) {
            DecimalFormat df = new DecimalFormat("0.#");
            String numFormat = df.format(numb);
            text = numFormat;
            System.out.print(text + " ");

        }
    }
}
