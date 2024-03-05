package Esercizio3;

import java.sql.Array;
import java.util.Objects;
import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean openLoop = true;
        while (openLoop){
        System.out.println("Vuoi chiudere il Loop? Se si inserisci :q");
        String risposta = scanner.nextLine();


        if (Objects.equals(risposta, ":q")) {
            openLoop = false;
            scanner.close();
            System.out.println("Loop in chiusura");
        }
    }
    }

}
