package ListyIterator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ListyIterator listyIterator = null;
        while (!input.equals("END")){
            String[] data = input.split(" ");
            String command = data[0];
            switch (command) {
                case "Create":
                    String[] elements = Arrays.copyOfRange(data,1,data.length);
                    listyIterator = new ListyIterator(elements);
                    break;
                case "Move":
                    System.out.println(listyIterator.Move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.HasNext());
                    break;
                case "Print":
                    try {
                        listyIterator.Print();
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "PrintAll":
                    listyIterator.PrintAll();
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
