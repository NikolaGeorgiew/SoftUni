package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbsList = Arrays.stream(scanner.nextLine().
                        split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Finish")){
            String command = input.split(" ")[0];
            int value = Integer.parseInt(input.split(" ")[1]);
            switch (command) {
                case "Add":
                    numbsList.add(value);
                    break;
                case "Remove":
                    for (int i = 0; i < numbsList.size(); i++) {
                        int currentNumber = numbsList.get(i);
                        if (currentNumber == value) {
                            numbsList.remove(i);
                            break;
                        }
                    }
                    break;
                case "Replace":
                    int replacement = Integer.parseInt(input.split(" ")[2]);
                    for (int i = 0; i < numbsList.size(); i++) {
                        int currentNumber = numbsList.get(i);
                        if (currentNumber == value) {
                            numbsList.set(i,replacement);
                            break;
                        }
                    }
                    break;
                case "Collapse":
                    int firstSize = numbsList.size();
                    for (int i = 0; i < numbsList.size(); i++) {
                        int currentNumb = numbsList.get(i);
                        if (currentNumb < value){
                            numbsList.remove(i);
                            i = i -1;
                        }
                    }

                    break;
            }
            input = scanner.nextLine();
        }
        for (int numb : numbsList) {
            System.out.print(numb + " ");
        }
    }
}
