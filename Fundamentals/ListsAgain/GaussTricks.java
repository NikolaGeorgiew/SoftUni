package ListsAgain;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTricks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbsList = Arrays.stream(scanner.nextLine().
                split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int firstSzie = numbsList.size();
        for (int i = 0; i <firstSzie /2; i++) {
            int sum = numbsList.get(i) + numbsList.get(numbsList.size() - 1);
            numbsList.set(i,sum);
            numbsList.remove(numbsList.size() - 1);
        }
        for (int numb : numbsList){
            System.out.print(numb + " ");
        }
    }
}
