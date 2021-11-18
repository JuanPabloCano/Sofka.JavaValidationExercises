package Exercise_8;

import java.util.Scanner;

public class WorkingDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dia;

        System.out.println("Ingrese un día de la semana");
        dia = sc.nextLine();

        switch (dia){
            case "lunes", "martes", "miercoles", "jueves", "viernes" -> System.out.println("Es un dia laboral");
            case "sabado", "domingo" -> System.out.println("No es un dia laboral");
            default -> System.out.println("ERROR");
        }
    }
}
