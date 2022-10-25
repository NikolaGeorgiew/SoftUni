package FinalExamPreparation;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPieces = Integer.parseInt (scanner.nextLine());

        Map<String, List<String>> piecesMap = new LinkedHashMap<>();

        for (int i = 1; i <= countPieces; i++) {
            String input = scanner.nextLine();
            String pieceName = input.split("\\|")[0];
            String composer = input.split("\\|")[1];
            String tone = input.split("\\|")[2];
            List<String> keyList = new ArrayList<>();
            keyList.add(composer);
            keyList.add(tone);
            piecesMap.put(pieceName,keyList);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")){
            //Add|{piece}|{composer}|{key}
            //Remove|{piece}
            //ChangeKey|{piece}|{new key
            if (command.contains("Add")){
                String newPiece = command.split("\\|")[1];
                String newComposer = command.split("\\|")[2];
                String newTone = command.split("\\|")[3];
                if (piecesMap.containsKey(newPiece)){
                    System.out.println(newPiece + " is already in the collection!");
                } else {
                    List<String> newKeys = new ArrayList<>();
                    newKeys.add(newComposer);
                    newKeys.add(newTone);
                    piecesMap.put(newPiece, newKeys);
                    System.out.printf("%s by %s in %s added to the collection!%n",newPiece,newComposer,newTone);
                }
            } else if (command.contains("Remove")){
                String piece = command.split("\\|")[1];
                if (piecesMap.containsKey(piece)){
                    piecesMap.remove(piece);
                    System.out.printf("Successfully removed %s!%n",piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                }

            } else if (command.contains("ChangeKey")){
                String piece = command.split("\\|")[1];
                String tone = command.split("\\|")[2];
                if (piecesMap.containsKey(piece)){
                    List<String> newKeys = piecesMap.get(piece);
                    newKeys.remove(1);
                    newKeys.add(tone);
                    piecesMap.put(piece,newKeys);
                    System.out.printf("Changed the key of %s to %s!%n",piece,tone);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                }

            }

            command = scanner.nextLine();
        }
        //{Piece} -> Composer: {composer}, Key: {key
        piecesMap.entrySet().forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n",entry.getKey(), entry.getValue().get(0),entry.getValue().get(1)));
    }
}
