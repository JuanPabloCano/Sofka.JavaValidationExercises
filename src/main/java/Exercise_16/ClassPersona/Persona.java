package Exercise_16.ClassPersona;

import java.util.Random;

public class Persona {
    private String nombre;
    private int edad = 0;
    private int dni;
    private char sexo;
    private int peso = 0;
    private double altura = 0.0;

    public Persona(String nombre, int edad, char sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
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

    public String comprobarSexo (char sexo){
        if (this.sexo != sexo){ return "h";}
        return "h";
    }

    public String toStrings(){
        return "Nombre: "+ getNombre()+ ", edad: "+ getEdad() + ", sexo: " + getSexo()+ ", peso: "+ getPeso()
                + ", altura: "+ getAltura();
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
