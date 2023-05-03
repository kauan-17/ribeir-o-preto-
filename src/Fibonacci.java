import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        // Função que retorna o n-ésimo número da sequência de Fibonacci
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        // Lê o número informado pelo usuário
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int num = sc.nextInt();

        // Verifica se o número pertence à sequência de Fibonacci
        boolean pertence = false;
        int i = 0;
        while (fibonacci(i) <= num) {
            if (fibonacci(i) == num) {
                pertence = true;
                break;
            }
            i++;
        }

        // Imprime a mensagem correspondente
        if (pertence) {
            System.out.printf("O número %d pertence à sequência de Fibonacci", num);
        } else {
            System.out.printf("O número %d não pertence à sequência de Fibonacci", num);
        }
    }

}