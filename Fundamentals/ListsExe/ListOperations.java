package ListsExe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbsList = Arrays.stream(scanner.nextLine().
                        split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")){
            if (input.contains("Add")){
                int number = Integer.parseInt(input.split(" ")[1]);
                numbsList.add(number);
            } else if (input.contains("Insert")){
                int number1 = Integer.parseInt(input.split(" ")[1]);
                int index = Integer.parseInt(input.split(" ")[2]);
                if (isValidIndex(numbsList,index)) {
                    numbsList.add(index,number1);
                } else {
                    System.out.println("Invalid index");
                }

            }else if (input.contains("Remove")){
                int index1 = Integer.parseInt(input.split(" ")[1]);
                if (isValidIndex(numbsList,index1)){
                    numbsList.remove(index1);
                } else {
                    System.out.println("Invalid index");
                }


            } else if (input.contains("Shift left")){
                int count = Integer.parseInt(input.split(" ")[2]);
                for (int i = 1; i <= count; i++) {
                    int firstNumber = numbsList.get(0);
                    int lastNumber = numbsList.get(numbsList.size() - 1);

                    numbsList.remove(0);
                    numbsList.add(firstNumber);


                }
            } else if (input.contains("Shift right")){
                int count1 = Integer.parseInt(input.split(" ")[2]);
                for (int i = 1; i <= count1; i++) {
                    int firstNumber = numbsList.get(0);
                    int lastNumber = numbsList.get(numbsList.size() - 1);

                    numbsList.remove(numbsList.size() -1);
                    numbsList.add(0,lastNumber);
                }
            }

            input = scanner.nextLine();
        }
        for (int numbs : numbsList) {
            System.out.print(numbs + " ");
        }
    }
    public static boolean isValidIndex(List<Integer> list, int index) {
        return index >= 0 && index <= list.size() - 1;
    }
}
