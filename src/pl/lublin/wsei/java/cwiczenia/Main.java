package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
        Scanner src = new Scanner(System.in);
        //acc.setName("piotr Gołabek");
        System.out.println("Wpisz tekst: ");
        System.out.println(acc.translit(src.next()));
        //System.out.printf(„%s%n”,Account.capitalize(„stanisŁaw maruSARz”));

    }
}
