package FinalExam;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arr = input.split(" \\| ");

        HashMap<String, String> noteBook = new LinkedHashMap<>();
        HashMap<String, String> secondNoteBook = new LinkedHashMap<>();
        Map<String,String> treeMap = new TreeMap<String,String>();
        Map<String,String> secondTreeMap = new TreeMap<String,String>();

        for (int i = 0; i < arr.length; i++) {
            boolean isLetter = false;
            String words = arr[i].split(": ")[0];
            String definition = arr[i].split(": ")[1];
            StringBuilder builder = new StringBuilder(words);
            if (noteBook.containsKey(words)) {
                secondNoteBook.put(words, definition);
                secondTreeMap.put(words,definition);
            } else {
                noteBook.put(words, definition);
                treeMap.put(words,definition);
            }

        }
        String testingWords = scanner.nextLine();
        String[] testArr = testingWords.split(" \\| ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < testArr.length; i++) {
            String word = testArr[i];
            list.add(word);
        }


        String command = scanner.nextLine();

        if (command.equals("Test")) {


            String methodWord = list.get(0);
                if (noteBook.containsKey(list.get(0)) && !secondNoteBook.containsKey(list.get(0))) {
                    for (Map.Entry<String, String> entry : noteBook.entrySet()) {
                        String words = entry.getKey();
                        String definition = entry.getValue();
                        System.out.println(words + ":");
                        System.out.print(" -" + definition);
                        System.out.println();
                    }
                } else if (noteBook.containsKey(list.get(0)) && secondNoteBook.containsKey(list.get(0))) {

                    for (Map.Entry<String,String> entry : treeMap.entrySet()){
                        boolean isPrinted = false;
                        String words = entry.getKey();
                        String definition = entry.getValue();

                        if (list.contains(words)) {

                            System.out.println(words + ":");
                            System.out.print(" -" + definition);
                            isPrinted = true;
                            System.out.println();
                            for (Map.Entry<String,String> entry1: secondTreeMap.entrySet()){

                                String words1 = entry1.getKey();
                                String definition1 = entry1.getValue();
                                if (!words.equals(words1)) {
                                    continue;
                                }
                                if (isPrinted && !secondTreeMap.containsKey(words)){
                                    break;
                                }
                                if (list.contains(words)){
                                    System.out.print(" -" + definition1);
                                    System.out.println();
                                    isPrinted = true;
                                    break;
                                }
                            }


                        }

                    }


                }

            } else if (command.equals("Hand Over")) {
                for (Map.Entry<String, String> entry : noteBook.entrySet()) {
                    String word = entry.getKey();
                    System.out.print(word + " ");
                }
            }
        }
        public static boolean isWord (String word) {
        for (char symbol : word.toCharArray()){
            if (!Character.isDigit(symbol)){
                return false;
            }
        }
        return true;
        }
    }
