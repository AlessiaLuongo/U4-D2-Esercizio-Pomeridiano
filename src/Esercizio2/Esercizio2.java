package Esercizio2;

public class Esercizio2 {
    public static void main(String[] args) {


    }
    public static String stampaInLettere(int numeroInserito){
        return switch (numeroInserito) {
            case 0 -> "zero";
            case 1 -> "uno";
            case 2 -> "due";
            case 3 -> "tre";
            default -> "Il numero inserito non rispetta i nostri standard";
        };
    }
}
