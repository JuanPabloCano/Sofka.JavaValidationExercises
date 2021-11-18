package Exercise_17.Clases;

public class Television extends Electrodomestico{
    private static int pulgadas_defecto = 20;
    private static boolean sintonizador_defecto = false;

    int pulgadas;
    boolean sintonizador;

    public Television(double precioBase, String color, char consumoEnergetico, int peso, int pulgadas, boolean sintonizador) {
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public Television(double precioBase, int peso) {
        super(precioBase, peso);
    }

    public Television() {}


    public int getPulgadas() {
        return pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    @Override
    public double precioFinal() {
        double extra = super.precioFinal();

        if (pulgadas > 40 ){
            extra += precioBase * 0.3;
        }
        if (sintonizador){
            extra += 50;
        }
        return extra;
    }
}
