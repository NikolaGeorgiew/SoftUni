package FinalExamPrep3;

import java.util.*;

public class PlantDiscoveryAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt (scanner.nextLine());

        Map<String,Integer> plantMap = new LinkedHashMap<>();
        Map<String, List<Double>> ratingMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String plant = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);
            plantMap.put(plant,rarity);
            ratingMap.put(plant,new ArrayList<>());

        }
        String commands = scanner.nextLine();
        while (!commands.equals("Exhibition")){
            if (commands.contains("Rate")){
                String info = commands.split(": ")[1];
                String plant = info.split(" - ")[0];
                double rating = Double.parseDouble(info.split(" - ")[1]);
                

            } else if (commands.contains("Update")){

            } else if (commands.contains("Reset")){

            }


            commands = scanner.nextLine();
        }
    }
}
