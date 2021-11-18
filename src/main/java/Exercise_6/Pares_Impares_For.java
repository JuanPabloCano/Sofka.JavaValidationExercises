package Exercise_6;

public class Pares_Impares_For {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println("Par: " + i);
            }else {
                System.out.println("Impar: " + i);
            }
        }
    }
}
