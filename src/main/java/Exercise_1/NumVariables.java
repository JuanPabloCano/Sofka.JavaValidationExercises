package Exercise_1;

public class NumVariables {
    public static void main(String[] args) {

        int num1 = 9;
        int num2 = 9;

        if (num1 > num2){
            System.out.println(num1 + " es mayor que "+ num2);
        }else if (num2 > num1){
            System.out.println(num2 + " es mayor que "+ num1);
        }else{
            System.out.println(num1 + " y " + num2 + " son iguales");
        }
    }
}
