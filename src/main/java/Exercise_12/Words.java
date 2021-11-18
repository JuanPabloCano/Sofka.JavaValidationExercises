package Exercise_12;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word_1;
        String word_2;
        boolean comparator;

        System.out.println("Ingrese una palabra");
        word_1 = sc.nextLine();
        System.out.println("Ingrese otra palabra");
        word_2 = sc.nextLine();

        if (word_1.equals(word_2)){
            System.out.println("Las palabras son iguales");
        }else {
            comparator = word_1.contains(word_2);
            System.out.println(comparator);
        }
    }
}
