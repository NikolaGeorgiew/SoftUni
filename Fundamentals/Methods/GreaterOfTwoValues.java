package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        switch (command) {
            case "int":
                int firstNumb = Integer.parseInt (scanner.nextLine());
                int secondNumb = Integer.parseInt (scanner.nextLine());
                System.out.println(getMax(firstNumb,secondNumb));
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstChar,secondChar));
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(getMax(firstString,secondString));
                break;
        }
    }
    public static int getMax(int firstNum,int secondNum) {
        if (firstNum> secondNum) {
            return firstNum;
        } else {
            return  secondNum;
        }
    }
    public static char getMax(char firstChar, char secondChar) {
        if (firstChar > secondChar) {
            return firstChar;
        }else {
            return secondChar;
        }
    }
    public static String getMax(String first,String second) {
        String result = "";
        if (first.compareTo(second) > 0) {
            result = first;
        } else {
            result = second;
        }
        return  result;
    }
}
