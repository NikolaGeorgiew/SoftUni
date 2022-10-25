package ListsExe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")){

            if (command.contains("merge")){
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                } else if (endIndex > list.size()){
                    endIndex = list.size() - 1;
                }
                boolean isValidIndex = startIndex <= list.size() - 1 && endIndex >= 0 && startIndex < endIndex;
                if (isValidIndex) {
                    String mergeResult = "";
                    for (int i = startIndex; i <= endIndex; i++) {
                        String currentElement = list.get(i);
                        mergeResult += currentElement;
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        list.remove(startIndex);
                    }
                    list.add(startIndex,mergeResult);
                }
            }else if (command.contains("divide")){
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int position = Integer.parseInt(command.split(" ")[2]);
                String elementForDivide = list.get(index1);
                list.remove(index1);

                int partSize = elementForDivide.length() / 2;



            }


            command = scanner.nextLine();
        }
    }
}
