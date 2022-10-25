package ListsExe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().
                        split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().
                        split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        while (firstPlayer.size() != 0 && secondPlayer.size() != 0) {

            int firstPlayerCurrentCard = firstPlayer.get(0);
            int secondPlayerCurrentCard = secondPlayer.get(0);
            firstPlayer.remove(0);
            secondPlayer.remove(0);

            if (firstPlayerCurrentCard> secondPlayerCurrentCard){
                firstPlayer.add(firstPlayerCurrentCard);
                firstPlayer.add(secondPlayerCurrentCard);


            }else if (secondPlayerCurrentCard > firstPlayerCurrentCard) {
                secondPlayer.add(secondPlayerCurrentCard);
                secondPlayer.add(firstPlayerCurrentCard);
            }

        }
        if (firstPlayer.isEmpty()) {
            System.out.printf("Second player wins! Sum: %d",getSum(secondPlayer));
        } else if (secondPlayer.isEmpty()) {
            System.out.printf("First player wins! Sum: %d",getSum(firstPlayer));

        }


    }
    public static int getSum(List<Integer> list) {
        int sum = 0;
        for (int numb: list){
            sum += numb;
        }
        return sum;
    }
}
