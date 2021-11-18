package Exercise_4;

import java.util.Scanner;

public class ProductoIva {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double producto;
        double iva = 0.21;
        double totalIva;
        double valorTotal;

        System.out.println("Ingrese el precio del producto");
        producto = sc.nextDouble();

        totalIva = (producto * iva);
        valorTotal = totalIva + producto;

        System.out.println("Iva: " + totalIva);
        System.out.println("Precio final: " + valorTotal + " pesos");

    }
}
