package Exercise_17.Clases;

public class Electrodomestico {

    protected static double precio_baseDefecto = 100;
    protected static String color_defecto = "Blanco";
    protected static char consumo_energeticoDefecto = 'F';
    protected static int peso_defecto = 5;

    // Atributos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;


    public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico() {
    }


    public final void comprobarConsumoEnergetico(char letra) {

        if (letra >= 65 && letra <= 70) {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = consumo_energeticoDefecto;
        }
    }

    public String comprobarColor(String color) {

        final String[] comprobarColor = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};

        for (String i : comprobarColor) {
            if (i.equalsIgnoreCase(color)) {
                return color;
            }
        }
        return this.color = color_defecto;
    }

    public double precioFinal() {
        double extra = 0;

        switch (consumoEnergetico) {
            case 'A':
                extra += 100;
                break;
            case 'B':
                extra += 80;
                break;
            case 'C':
                extra += 60;
                break;
            case 'D':
                extra += 50;
                break;
            case 'E':
                extra += 30;
                break;
            case 'F':
                extra += 10;
                break;
        }

        if (peso >= 0 && peso <= 19){ extra += 10; }
        if (peso >= 20 && peso <=49){ extra += 50; }
        if (peso >= 50 && peso <= 79){ extra += 80; }
        if (peso >= 80){ extra += 100; }

        return precioBase + extra;
    }

    public static double getPrecio_baseDefecto() {
        return precio_baseDefecto;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }
}