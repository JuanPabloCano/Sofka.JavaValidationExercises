package Exercise_7;

import java.util.Scanner;

public class Cero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cero = 0;
        double numComparador;

        do {
            System.out.println("Ingrese un número");
            numComparador = sc.nextDouble();

            if (numComparador > cero){
                System.out.println("Número ingresado " + numComparador + " es mayor que " + cero);
            }else {
                System.out.println(numComparador + " es menor que cero");
            }
            }while (numComparador != cero && numComparador < cero);
    }
}
