package FinalExamPrep3;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt (scanner.nextLine());

        Map<String, List<Integer>> plantMap = new LinkedHashMap<>();


        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String plant = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);
            List<Integer> plantInfo = new ArrayList<>();
            if (plantMap.containsKey(plant)) {
                int currentRarity = plantMap.get(plant).get(0);
                plantInfo.add(currentRarity + rarity);
                plantInfo.add(1, 0);
                plantMap.put(plant,plantInfo);
            } else {
                plantInfo.add(rarity);
                plantInfo.add(1, 0);
                plantMap.put(plant,plantInfo);
            }
        }
        String commands = scanner.nextLine();
        while (!commands.equals("Exhibition")){
            int count = 0;
            if (commands.contains("Rate")){
                String info = commands.split(": ")[1];
                String plant = info.split(" - ")[0];
                int rating = Integer.parseInt(info.split(" - ")[1]);
                if (isValid(plant,plantMap)){
                    if (plantMap.get(plant).get(1) == 0) {
                        plantMap.get(plant).set(1,rating);
                    } else {
                        int currentRating = plantMap.get(plant).get(1);
                        plantMap.get(plant).set(1, currentRating + rating);

                    }

                } else {
                    System.out.println("error");
                }
            } else if (commands.contains("Update")){
                String info = commands.split(": ")[1];
                String plant = info.split(" - ")[0];
                int rarity = Integer.parseInt(info.split(" - ")[1]);
                plantMap.get(plant).set(1,rarity);


            } else if (commands.contains("Reset")){
                String plant = commands.split(": ")[1];
                plantMap.get(plant).set(1, 0);
            }

            commands = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");



    }
    public static boolean isValid (String plant, Map<String, List<Integer>> plantMap){
        if (plantMap.containsKey(plant)){
            return true;
        } else  {
            return false;
        }
    }
}
