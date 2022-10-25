package Methods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double widthInput = Double.parseDouble (scanner.nextLine());
        double lengthInput = Double.parseDouble (scanner.nextLine());

        double printResult = rectangleArea(widthInput,lengthInput);
        System.out.printf("%.0f",printResult);

    }
    public static double rectangleArea(double width, double length){
        double result = width * length;
        return result;
    }
}
