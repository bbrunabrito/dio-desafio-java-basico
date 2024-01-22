import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int num2 = input.nextInt();

        try {
            contar(num1, num2);
        }
        catch (ParametrosInvalidosException e) {
            System.out.println(e);
        }


    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if(num2 < num1) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for(int i = 1; i < (num2 - num1); i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}