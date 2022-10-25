package Generics;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Integer[] arr = ArrayCreator.create(3,15);

        for (int s : arr) {
            System.out.print(s + " ");
        }
    }
}
