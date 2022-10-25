package Lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sizeList = numbList.size();
        for (int i = 0; i < sizeList / 2 ; i++) {
            int sum = numbList.get(i) + numbList.get(numbList.size() - 1);
            numbList.set(i,sum);
            numbList.remove(numbList.size() - 1);

        }
        for (int numb: numbList) {
            System.out.print(numb + " ");
        }
    }
}
