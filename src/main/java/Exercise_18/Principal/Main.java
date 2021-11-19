package Exercise_18.Principal;

import Exercise_18.Clases.Serie;
import Exercise_18.Clases.Videojuego;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int contadorV = 0;
        int contadorS = 0;
        int contadorTotal;

        Videojuego[] v1 = new Videojuego[5];
        v1[0] = new Videojuego("GTA-San Andreas", 6, "Acción", "RockStar");
        v1[1] = new Videojuego("PepsiMan", 65, "Aventura", "KID");
        v1[2] = new Videojuego("Black", 60);
        v1[3] = new Videojuego("Halo", 100, "Disparos", "Bungie Studios");
        v1[4] = new Videojuego("YU-GI-OH", 78);

        Serie[] s1 = new Serie[5];
        s1[0] = new Serie("Lost", 80, "Drama", "J.J Abrams");
        s1[1] = new Serie("Stranger Things", 4, "Misterio", "Hermanos Duffer");
        s1[2] = new Serie("Arrow", "Greg Berlanti");
        s1[3] = new Serie("Lucifer", 6, "Fantasía", "Tom Kapinos");
        s1[4] = new Serie("Limitless", "Bradley Cooper");


        // Array para videojuegos entregados
        ArrayList<Object> gamesArray = new ArrayList<>();

        // Entrega de videojuegos
        v1[0].entregar();
        v1[2].entregar();
        v1[4].entregar();

        // For para contar y separar los videojuegos entregados
        for (Videojuego videojuego : v1) {
            if (videojuego.isEntregado()) {
                gamesArray.add(videojuego);
                contadorV++;
            }
        }
        System.out.println("Videojuegos entregados: " + contadorV + "\n");
        // For para imprimir los videojuegos entregados
        for (Object v : gamesArray) {
            System.out.println(v + "\n");
        }

        System.out.println("----------------------------------------------------------------------------");

        // Array para series entregadas
        ArrayList<Object> seriesArray = new ArrayList<>();

        // Entrega de series
        s1[1].entregar();
        s1[3].entregar();

        // For para contar y separar las series entregadas
        for (Serie series : s1) {
            if (series.isEntregado()) {
                seriesArray.add(series);
                contadorS++;
            }
        }
        System.out.println("Series entregadas: " + contadorS + "\n");
        // For para imprimir las series entregadas
        for (Object s : seriesArray) {
            System.out.println(s + "\n");
        }

        System.out.println("----------------------------------------------------------------------------");

        contadorTotal = contadorV + contadorS;
        System.out.println("Total de videojuegos y series entregados: " + contadorTotal);
    }
}
