package Esercizio4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int risposta = scanner.nextInt();

        if (risposta > 0) {
            for (int i = risposta; i >= 1; i--) {
                System.out.println(i);
                scanner.close();
            }

        }
    }
}
