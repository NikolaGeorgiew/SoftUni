package FinalExamPreparation;

import java.util.Scanner;

public class WorldTur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stops = scanner.nextLine();
        String command = scanner.nextLine();
        StringBuilder stopsBuilder = new StringBuilder(stops);

        while (!command.equals("Travel")){
            if (command.contains("Add Stop")){
                int index = Integer.parseInt(command.split(":")[1]);
                String newStop = command.split(":")[2];
                if (isValidIndex(index,stopsBuilder)){
                    stopsBuilder.insert(index,newStop);
                }

            } else if (command.contains("Remove Stop")){
                int startIndex = Integer.parseInt(command.split(":")[1]);
                int endIndex = Integer.parseInt(command.split(":")[2]);
                if (isValidIndex(startIndex,stopsBuilder) && isValidIndex(endIndex,stopsBuilder)) {
                    stopsBuilder.delete(startIndex,endIndex + 1);
                }

            } else if (command.contains("Switch")){
                String oldStop = command.split(":")[1];
                String newStop = command.split(":")[2];
                if (stopsBuilder.toString().contains(oldStop)){
                    String newString = stopsBuilder.toString().replace(oldStop,newStop);
                    stopsBuilder = new StringBuilder(newString);



                }
            }

            System.out.println(stopsBuilder);
            command = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + stopsBuilder);
    }
    public static boolean isValidIndex (int index, StringBuilder stops){
        return index >= 0 && index <= stops.length() -1;
    }
}
