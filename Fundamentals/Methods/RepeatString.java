package Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int countInput = Integer.parseInt (scanner.nextLine());

        System.out.println(printResult(input,countInput));


    }
    public static String printResult(String str,int count) {
        String result = "";
        for (int i = 1; i <= count; i++) {
            result = result + str;
        }
        return  result;
    }
}
