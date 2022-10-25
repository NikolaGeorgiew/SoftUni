package ListsAgain;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        for (int i = 0; i < numbList.size() -1; i++) {
            double firstNumb = numbList.get(i);
            double secondNumb = numbList.get(i + 1);
            if (firstNumb == secondNumb) {
                numbList.set(i, firstNumb + secondNumb);
                numbList.remove(i + 1);
                i = -1;
            }
        }
        String text = "";
        for (double numb : numbList) {
            DecimalFormat df = new DecimalFormat("0.#");
             String result = df.format(numb);
             text = result;
            System.out.print(text + " ");
        }
    }
}
