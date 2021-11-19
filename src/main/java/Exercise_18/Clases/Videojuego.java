package Exercise_18.Clases;

public class Videojuego implements Entregable{
    private static final int horasEstimadasDefault = 10;
    private static final boolean entregadoDefault = false;
    private static final String generoDefault = "No seleccionado";
    private static final String companiaDefault = "Desconocido";

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = Videojuego.generoDefault;
        this.compania = Videojuego.companiaDefault;
    }
    public Videojuego() {
        this.horasEstimadas = Videojuego.horasEstimadasDefault;
        this.entregado = Videojuego.entregadoDefault;
        this.genero = Videojuego.generoDefault;
        this.compania = Videojuego.companiaDefault;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }


    @Override
    public String toString() {
        return "Videojuego {" +
                "titulo ='" + titulo + '\'' +
                ", horasEstimadas =" + horasEstimadas +
                ", entregado =" + entregado +
                ", genero ='" + genero + '\'' +
                ", compania ='" + compania + '\'' +
                '}';
    }

    @Override
    public boolean entregar() {
        return this.entregado = true;
    }

    @Override
    public boolean devolver() {
        return this.entregado = Videojuego.entregadoDefault;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        int hour = this.horasEstimadas;
        return Integer.compare(hour, ((Videojuego) a).getHorasEstimadas());
    }
}
