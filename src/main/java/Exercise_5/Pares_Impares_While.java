package Exercise_5;

public class Pares_Impares_While {
    public static void main(String[] args) {
        int num = 1;

        while (num <= 100){
            if (num % 2 == 0){
                System.out.println("Par:" + num);
            }else{
                System.out.println("Impar: " + num);
            }
            num++;
        }
    }
}
