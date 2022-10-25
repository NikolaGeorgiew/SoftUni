package Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int num1Input = Integer.parseInt (scanner.nextLine());
        int num2Input = Integer.parseInt (scanner.nextLine());

        switch (command) {
            case "add":
                printAdd(num1Input,num2Input);
                break;
            case "multiply":
                printMultiply(num1Input,num2Input);
                break;
            case "subtract":
                printSubtract(num1Input,num2Input);
                break;
            case "divide":
                printDivide(num1Input,num2Input);
                break;
        }
    }
    public static void printAdd(int num, int num1) {
        System.out.println(num + num1);
    }


    public static void printMultiply(int num, int num1) {
        System.out.println(num * num1);
    }

    public static void printSubtract(int num, int num1) {
        System.out.println(num - num1);
    }

    public static void printDivide(int num, int num1) {
        System.out.println(num / num1);
    }
}
