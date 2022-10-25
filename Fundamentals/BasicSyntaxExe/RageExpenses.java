package PregovorExe;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLostGames = Integer.parseInt (scanner.nextLine());
        double headsetPrice = Double.parseDouble (scanner.nextLine());
        double mousePrice = Double.parseDouble (scanner.nextLine());
        double keyboardPrice = Double.parseDouble (scanner.nextLine());
        double displayPrice = Double.parseDouble (scanner.nextLine());

        int trashedHeadset = countLostGames / 2;
        int trashedMouse = countLostGames / 3;
        int trashedKeyboard = countLostGames / 6;
        int trashedDisplay = countLostGames / 12;

        double finalPrice = (trashedHeadset * headsetPrice) + (trashedMouse * mousePrice) + (trashedKeyboard * keyboardPrice) + (trashedDisplay * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", finalPrice);
    }
}
