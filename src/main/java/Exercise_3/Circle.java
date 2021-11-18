package Exercise_3;

import javax.swing.*;

public class Circle {
    public static void main(String[] args) {

        String radio;
        double area;

        radio = JOptionPane.showInputDialog("Ingrese el radio del circulo");

        area = Math.PI * Math.pow(Double.parseDouble(radio) , 2);

        System.out.println("Area: " + area);
    }
}
