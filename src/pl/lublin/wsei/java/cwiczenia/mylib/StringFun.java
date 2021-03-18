package pl.lublin.wsei.java.cwiczenia.mylib;
import pl.lublin.wsei.java.cwiczenia.isPalindromeTest;
public class StringFun {
    public static boolean isPalindrome(String arg) {


        String odwroc = "";

        char[] ctab = arg.toCharArray();
        char[] otab = arg.toCharArray();
        int j = 0;
        for (int i = ctab.length - 1; i >= 0; i--, j++) {
            odwroc += otab[i];
        }


        boolean wynik = odwroc == arg;
        return wynik;
    }
}
