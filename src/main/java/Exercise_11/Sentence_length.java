package Exercise_11;

import java.util.LinkedList;
import java.util.Scanner;

public class Sentence_length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList <Character> vowels = new LinkedList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        String phrase;
        long countVowel;

        System.out.println("Ingrese una frase");
        phrase = sc.nextLine();

        System.out.println("Longitud de la frase: "+ phrase.length());

        countVowel = phrase.chars().filter(x -> vowels.contains((char) x)).count();

        System.out.println("Número de vocales: "+ countVowel);



    }
}
