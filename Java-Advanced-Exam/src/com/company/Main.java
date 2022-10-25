package com.company;

import java.io.FilterOutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> milligramsCoffeineStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
                .forEach(milligramsCoffeineStack::push);

        ArrayDeque<Integer> energyDrinksQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
                .forEach(energyDrinksQueue::offer);

        int stamatCoffeine = 0;
        while (!milligramsCoffeineStack.isEmpty() && !energyDrinksQueue.isEmpty()) {
            int currentMiligrams = milligramsCoffeineStack.peek();
            int currentEnergyDrink = energyDrinksQueue.peek();
            int sum = currentEnergyDrink * currentMiligrams;
            if (sum + stamatCoffeine <= 300 ) {
                milligramsCoffeineStack.pop();
                energyDrinksQueue.poll();
                 stamatCoffeine += sum;
            } else if (sum + stamatCoffeine >= 300){
                milligramsCoffeineStack.pop();
                energyDrinksQueue.poll();
                energyDrinksQueue.offer(currentEnergyDrink);
                if (stamatCoffeine - 30 <= 0) {
                    stamatCoffeine = 0;
                } else {
                    stamatCoffeine = stamatCoffeine - 30;
                }

            }
        }
        if (energyDrinksQueue.isEmpty()) {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        } else {
            String result = energyDrinksQueue.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.print("Drinks left: " + result);
            System.out.println();
        }

        System.out.printf("Stamat is going to sleep with %d mg caffeine.",stamatCoffeine);
    }
}
