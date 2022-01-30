package Exercise_16.Principal;

import Exercise_16.ClassPersona.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        int edad;
        char sexo;
        int peso;
        double altura;
        final String lowWeight = "está por debajo de su peso ideal";
        final String idealWeight = "está en un peso ideal";
        final String highWeight = "está en sobrepeso";
        final String overAge = "es mayor de edad";
        final String underAge = "es menor de edad";

        // Objeto p1

        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        System.out.println("Ingrese su sexo: (H) - (M)");
        sexo = sc.next().charAt(0);
        System.out.println("Ingrese su altura en metros");
        altura = sc.nextDouble();
        System.out.println("Ingrese su peso");
        peso = sc.nextInt();

        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);

        if (p1.calcularIMC(peso, altura) == -1){
            System.out.println(p1.getNombre()+ " " + lowWeight);
        }else if (p1.calcularIMC(peso, altura) == 0){
            System.out.println(p1.getNombre() + " " + idealWeight);
        }else{
            System.out.println(p1.getNombre()+ " " + highWeight);
        }

        if (p1.esMayorDeEdad()){
            System.out.println(p1.getNombre() + " "+ overAge);
        }else {
            System.out.println(p1.getNombre() + " "+ underAge);
        }
        System.out.println(p1);

        System.out.println();
        System.out.println("**************************************************************");
        System.out.println();

        // Objeto p2

        sc.nextLine();
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        System.out.println("Ingrese su sexo: (H) - (M)");
        sexo = sc.next().charAt(0);

        Persona p2 = new Persona(nombre, edad, sexo);

        if (p2.calcularIMC(p2.getPeso(), p2.getAltura()) == -1){
            System.out.println(p2.getNombre()+ " " + lowWeight);
        }else if (p2.calcularIMC(p2.getPeso(), p2.getAltura()) == 0){
            System.out.println(p2.getNombre() +" "+ idealWeight);
        }else{
            System.out.println(p2.getNombre()+ " "+ highWeight);
        }

        if (p2.esMayorDeEdad()){
            System.out.println(p2.getNombre() + " "+ overAge);
        }else {
            System.out.println(p2.getNombre() + " "+ underAge);
        }
        System.out.println(p2);

        System.out.println();
        System.out.println("**************************************************************");
        System.out.println();

        Persona p3 = new Persona();
        p3.setNombre("Carlos");
        p3.setEdad(34);
        p3.setSexo('h');
        p3.setAltura(1.81);
        p3.setPeso(54);

        if (p3.calcularIMC(p3.getPeso(), p3.getAltura()) == -1){
            System.out.println(p3.getNombre()+ " "+ lowWeight);
        }else if (p3.calcularIMC(p3.getPeso(), p3.getAltura()) == 0){
            System.out.println(p3.getNombre() +" "+ idealWeight);
        }else{
            System.out.println(p3.getNombre()+ " "+ highWeight);
        }

        if (p3.esMayorDeEdad()){
            System.out.println(p3.getNombre() + " "+ overAge);
        }else {
            System.out.println(p3.getNombre() + " "+ underAge);
        }
        System.out.println(p3);
    }
}
