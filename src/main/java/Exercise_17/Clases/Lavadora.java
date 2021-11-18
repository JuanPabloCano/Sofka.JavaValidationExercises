package Exercise_17.Clases;

public class Lavadora extends Electrodomestico{
    private static int carga_defecto = 5;

    private int carga;

    public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora(double precioBase, int peso) {
        super(precioBase, peso);
    }

    public Lavadora() {}

    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double extra = super.precioFinal();
        if (carga > 30){
            extra += 50;
        }
        return extra;
    }
}
