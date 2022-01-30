package Exercise_1;

import java.util.Scanner;

public class InputMismatchExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine()); // Se debe parsear para que no genere el conflicto
        String b = sc.nextLine();
        double c = sc.nextDouble();

        System.out.println("int:" + a);
        System.out.println("String:" + b);
        System.out.println("double:" + c);
    }
}
