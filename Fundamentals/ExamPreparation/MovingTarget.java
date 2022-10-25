package ExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().
                        split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] commands = input.split(" ");
            String typeCommand = commands[0];
            int index = Integer.parseInt(commands[1]);
            int value = Integer.parseInt(commands[2]);
            switch (typeCommand) {
                case "Shoot":
                    if (isValidIndex(targets,index)) {
                        int currentElement = targets.get(index);
                        currentElement = currentElement - value;
                        if (currentElement <= 0) {
                            targets.remove(index);
                        } else {
                            targets.set(index, currentElement);
                        }

                    }
                    break;
                case "Add":
                    if (isValidIndex(targets,index)) {
                        targets.add(index,value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    boolean isValidRadiusRange = index + value <= targets.size() -1 && index - value >= 0 && targets.size() >= index;
                    if (isValidRadiusRange) {
                        int radius = value * 2 + 1;
                        for (int i = 0; i < radius; i++) {
                            targets.remove(index - value);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }



            input = scanner.nextLine();
        }
        //for (int i = 0; i < targets.size(); i++) {
            //int currentNumb = targets.get(i);
            //if (targets.indexOf(currentNumb) != targets.size() - 1) {
                //System.out.print(currentNumb + "|");
            //} else {
                //System.out.print(currentNumb);
           // }
        //}

        List<String> stringList = new ArrayList<>(targets.size());
        for (int i = 0; i < targets.size(); i++) {
            stringList.add(String.valueOf(targets.get(i)));
        }
        System.out.println(String.join("|",stringList));
    }
    public static boolean isValidIndex (List<Integer> list, int index) {

        return index >= 0 && index <= list.size() -1;
    }
}
