public class somo {
    public static void main(String[] args) {
        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println(SOMA);
    }
}
/*
 * Isso porque o laço de repetição while irá executar 13 vezes (já que INDICE =
 * 13), somando à variável SOMA os valores de K a cada iteração.
 * 
 * No início, K é 0 e SOMA é 0. Na primeira iteração, K será incrementado para 1
 * e SOMA receberá o valor de 1, resultando em SOMA = 1.
 * 
 * Na segunda iteração, K será incrementado para 2 e SOMA receberá o valor de 3,
 * resultando em SOMA = 1 + 2 = 3.
 * 
 * Esse processo se repete até que K chegue ao valor de 13, quando a última soma
 * realizada será SOMA = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 =
 * 91.
 */