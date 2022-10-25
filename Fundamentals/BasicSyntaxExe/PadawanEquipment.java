package PregovorExe;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble (scanner.nextLine());
        int students = Integer.parseInt (scanner.nextLine());
        double priceSaber = Double.parseDouble (scanner.nextLine());
        double priceRobe = Double.parseDouble (scanner.nextLine());
        double priceBelt = Double.parseDouble (scanner.nextLine());


        double moneyForSabers = Math.ceil(students + students * 0.10) * priceSaber;
        double moneyForRobes = students * priceRobe;
        double moneyForBelts = (students - students / 6) * priceBelt;

        double neededMoney = moneyForBelts + moneyForRobes + moneyForSabers;

        if (neededMoney <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", neededMoney);
        }else  {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(neededMoney - money));
        }


    }
}
