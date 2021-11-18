package Exercise_9;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        String textoIngresado;

        System.out.println(texto);

        System.out.println("Ingrese una oración");
        textoIngresado = sc.nextLine();

        System.out.println(texto.replace("a", "e") + " " + textoIngresado);
    }
}
