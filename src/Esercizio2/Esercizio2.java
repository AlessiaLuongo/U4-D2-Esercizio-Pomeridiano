package Esercizio2;

public class Esercizio2 {
    public static void main(String[] args) {
        System.out.println(stampaInLettere(10));

    }
    public static String stampaInLettere(int numeroInserito){
        switch (numeroInserito){
            case 0:{
                return "zero";

            }
            case 1:{
                return "uno";

            }
            case 2 :{
                return "due";

            }
            case 3 :{
                return "tre";

            }
            default: return "Il numero inserito non rispetta i nostri standard";

        }
    }
}
