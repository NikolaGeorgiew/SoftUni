package ExamPreparation;

import java.util.Scanner;

public class GiuneaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityFoodKg = Double.parseDouble (scanner.nextLine());
        double foodInGrams = quantityFoodKg * 1000;

        double hayQuantityKg = Double.parseDouble (scanner.nextLine());
        double hayInGrams = hayQuantityKg * 1000;

        double coverQuantityKg = Double.parseDouble (scanner.nextLine());
        double coverInGrams = coverQuantityKg * 1000;

        double pigsWeightKg = Double.parseDouble (scanner.nextLine());
        double pigsGrams = pigsWeightKg * 1000;

        for (int i = 1; i <= 30; i++) {
            if (!isThereGroceries(foodInGrams,hayInGrams,coverInGrams)){
                break;
            }
            if (i % 2 == 0) {
                foodInGrams -= 300;
                if (!isThereGroceries(foodInGrams,hayInGrams,coverInGrams)) {
                    break;
                }
                hayInGrams -= foodInGrams * 0.05;
                if (i % 2 == 0 && i % 3 == 0) {
                    coverInGrams = coverInGrams - (pigsGrams / 3);
                }
            } else if (i % 3 == 0) {
                foodInGrams -= 300;
                if (isThereGroceries(foodInGrams,hayInGrams,coverInGrams)){
                    coverInGrams = coverInGrams - (pigsGrams / 3);
                }
            }
            else {
                foodInGrams -= 300;
            }
        }
        if (isThereGroceries(foodInGrams,hayInGrams,coverInGrams)) {
            double foodKG = foodInGrams / 1000;
            double hayKG = hayInGrams / 1000;
            double coverKg = coverInGrams / 1000;
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodKG,hayKG,coverKg);
        } else {
            System.out.println("Merry must go to the pet store!");
        }

    }
    public static boolean isThereGroceries(double food,double hay,double cover){
        return food > 0 && hay > 0 && cover > 0;
    }
}
