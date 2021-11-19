package Exercise_16.ClassPersona;

import java.util.Random;

public class Persona {
    private static final int edad_Default = 16;
    private static final char sexo_Default = 'H';
    private static final int peso_Default = 55;
    private static final double altura_Default = 1.64;


    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private int peso;
    private double altura ;

    public Persona(String nombre, int edad, char sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = Persona.peso_Default;
        this.altura = Persona.altura_Default;
    }

    public Persona(){}

    public int calcularIMC(int peso, double altura){
        double pesoIdeal = (peso / (Math.pow(altura, 2)));
        if (pesoIdeal < 20){ return -1; }
        else if (pesoIdeal >= 20 && pesoIdeal <= 25) { return 0; }
        return 1;
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    public char comprobarSexo (char sexo){
        if (sexo == sexo_Default){ return this.sexo = sexo;}
        return this.sexo = sexo_Default;
    }

    @Override
    public String toString() {
        return "Persona {" +
                "nombre ='" + nombre + '\'' +
                ", edad =" + edad +
                ", dni =" + generaDNI() +
                ", sexo =" + sexo +
                ", peso =" + peso +
                ", altura =" + altura +
                '}';
    }

    public String generaDNI(){
        Random rand = new Random();

        String asignacionLetra = "abcdefghijklmnopqrstuvwxyz";
        int randomInt = rand.nextInt(asignacionLetra.length());
        char letra = asignacionLetra.charAt(randomInt);

        this.dni = 1000000 + rand.nextInt(900000);

        return "" + this.dni + letra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
