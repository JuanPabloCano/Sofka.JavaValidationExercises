package Exercise_17.Principal;

import Exercise_17.Clases.Electrodomestico;
import Exercise_17.Clases.Lavadora;
import Exercise_17.Clases.Television;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Electrodomestico[] listaEle = new Electrodomestico[10];

        int option;
        int i = 0;

        final String color = "Ingrese un color";
        final String consumoEnergetic = "Ingrese el consumo energético";
        final String precio = "Ingrese el precio base";
        final String peso = "Ingrese el preso";
        final String carga = "Digite la carga";
        final String pulgadas = "Digite las pulgadas";
        final String sintonizador = "Tiene sintonizadorTDT? Digite true (si) | false (no)";

        String menu = """
                         1-AGREGAR ELECTRODOMESTICO
                         2-AGREGAR LAVADORA
                         3-AGREGAR TELEVISOR
                         """;
        do {
            System.out.println(menu);
            option = sc.nextInt();
            switch (option) {
                case 1 -> {
                    String colorEle;
                    char consumoEnergeticEle;
                    double precioBaseEle;
                    int pesoEle;

                    System.out.println(color);
                    colorEle = sc.nextLine();
                    System.out.println(consumoEnergetic);
                    consumoEnergeticEle = sc.next().charAt(0);
                    System.out.println(precio);
                    precioBaseEle = sc.nextInt();
                    System.out.println(peso);
                    pesoEle = sc.nextInt();

                    listaEle[i] = new Electrodomestico(precioBaseEle, colorEle, consumoEnergeticEle, pesoEle);
                    i++;
                }
                case 2 -> {
                    String colorLav;
                    char consumoEnergeticLav;
                    double precioBaseLav;
                    int pesoLav;
                    int cargaLav;

                    System.out.println(color);
                    colorLav = sc.nextLine();
                    System.out.println(consumoEnergetic);
                    consumoEnergeticLav = sc.next().charAt(0);
                    System.out.println(precio);
                    precioBaseLav = sc.nextInt();
                    System.out.println(peso);
                    pesoLav = sc.nextInt();
                    System.out.println(carga);
                    cargaLav = sc.nextInt();

                    listaEle[i] = new Lavadora(precioBaseLav, colorLav, consumoEnergeticLav, pesoLav, cargaLav);
                    i++;
                }
                case 3 -> {
                    double precioBaseTele;
                    String colorTele;
                    char consumoEnergeticTele;
                    int pesoTele;
                    int pulgadasTele;
                    boolean sintonizadorTele;

                    System.out.println(color);
                    colorTele = sc.nextLine();
                    System.out.println(consumoEnergetic);
                    consumoEnergeticTele = sc.next().charAt(0);
                    System.out.println(precio);
                    precioBaseTele = sc.nextInt();
                    System.out.println(peso);
                    pesoTele = sc.nextInt();
                    System.out.println(pulgadas);
                    pulgadasTele = sc.nextInt();
                    System.out.println(sintonizador);
                    sintonizadorTele = sc.nextBoolean();

                    listaEle[i] = new Television(precioBaseTele, colorTele, consumoEnergeticTele, pesoTele,
                            pulgadasTele, sintonizadorTele);
                    i++;
                }
                default -> System.out.println("ERROR");
            }

        }while (i < listaEle.length);

        double sumaElectrodomesticos = 0;
        double sumaLavadora = 0;
        double sumaTelevisores = 0;

        for (Electrodomestico electrodomestico : listaEle) {
            if (electrodomestico instanceof Electrodomestico) {
                sumaElectrodomesticos += electrodomestico.precioFinal();
            }
            if (electrodomestico instanceof Lavadora) {
                sumaLavadora += electrodomestico.precioFinal();
            }
            if (electrodomestico instanceof Television) {
                sumaTelevisores += electrodomestico.precioFinal();
            }
        }
        System.out.println("Suma de electrodomésticos: "+ sumaElectrodomesticos);
        System.out.println("Suma de las lavadoras: "+ sumaLavadora);
        System.out.println("Suma televisores: "+ sumaTelevisores);
    }
}
