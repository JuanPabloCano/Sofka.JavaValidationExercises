package Exercise_10;

import java.util.Scanner;

public class WhiteSpace_Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase;
        String fraseMod;

        System.out.println("Ingrese una frase u oración compuesta");
        frase = sc.nextLine();
        System.out.println("Frase ingresada: " + frase);

        fraseMod = frase.replace("\\s", "");

        System.out.println("Frase sin espacios en blanco: " + fraseMod);

    }
}
