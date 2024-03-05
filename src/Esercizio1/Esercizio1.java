package Esercizio1;

public class Esercizio1 {

    public static void main(String[] args) {
        System.out.println(stringaPariDispari("ciao"));
        System.out.println(annoBisestile(2024));
        }
    public static boolean stringaPariDispari(String stringInserita){
        if (stringInserita.length() % 2  == 0) {
            return true;
        }else return false;
    }
    public static boolean annoBisestile(int annoInserito){
        if (annoInserito % 4 == 0) {
            return true;
        } else if (annoInserito % 100 == 0 && annoInserito % 400 == 0 ) {
            return true;
        } else{
            return false;
        }
    }


    }



