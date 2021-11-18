package Exercise_15;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int selection;

        do {
            String menu = """
                ******** GESTION CINEMATOGRAFICA ********
                         1-NUEVO ACTOR
                         2-BUSCAR ACTOR
                         3-ELIMINAR ACTOR
                         4-MODIFICAR ACTOR
                         5-VER TODOS LOS ACTORES
                         6- VER PELICULAS DE LOS ACTORES
                         7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
                         8-SALIR""";

            System.out.println(menu);
            System.out.println();
            System.out.println("Seleccione una opción");
            selection = sc.nextInt();

            switch (selection){
                case 1, 2, 3, 4, 5, 6, 7:
                    return;
                case 8:
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
            }
        }while (selection != 8);

    }
}
