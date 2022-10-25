package Methods;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble (scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNum = Double.parseDouble (scanner.nextLine());

        double result = calculating(firstNum,operator,secondNum);

        System.out.printf("%.0f",result);

    }
    public static double calculating(double num1,String operator,double num2) {
        double result = 0;
        switch (operator) {
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
        }
        return result;
    }
}
