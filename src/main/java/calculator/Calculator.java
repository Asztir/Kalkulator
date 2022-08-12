package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Podaj liczbę naturalną a");
        int aNumber = scanner.nextInt();
        System.out.println("Podaj liczbę naturalną b");
        int bNumber = scanner.nextInt();

        int addition = aNumber + bNumber;
        int subtraction = aNumber - bNumber;
        int multiplication = aNumber * bNumber;
        float division = aNumber / bNumber;
        int modulo = aNumber%bNumber;

        System.out.println("Dodawanie " + addition);
        System.out.println("Odejmowanie " + subtraction);
        System.out.println("Mnożenie " + multiplication);
        System.out.println("Dzielenie " + division);
        System.out.println("Reszta z dzielenia " + modulo);

    }

}
