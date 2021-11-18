package Exercise_14;

import java.util.Scanner;

public class InputNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        System.out.println("Ingrese un número");
        i = sc.nextInt();

        for (; i <= 1000; i+=2){
            System.out.println(i);
        }
    }
}
