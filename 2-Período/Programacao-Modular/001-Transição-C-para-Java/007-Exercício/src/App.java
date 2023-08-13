// 7- Faça uma função que some os valores de dois vetores de tamanho N, ambos recebidos por parâmetro, e retorne um outro vetor, também de tamanho N, com o resultado da soma dos dois vetores, só que ao contrário.

import java.util.Scanner;

public class App {

    public static int[] somaInversa(int[] vetA, int[] vetB) {
        Scanner sc = new Scanner(System.in);

        int tamanhoVetor = vetA.length;
        int[] vetorResultado = new int[tamanhoVetor];
        for(int i = 0; i < tamanhoVetor; i++) {
            vetorResultado[i] = vetA[i] + vetB[i];
        }

        int[] vetorInvertido = new int[tamanhoVetor];
        for(int i = 0; i < tamanhoVetor; i++) {
            vetorInvertido[i] = vetorResultado[(tamanhoVetor - 1) - i];
        }

        sc.close();

        return vetorInvertido;
    }

    public static void main(String[] args) throws Exception {
        int[] vetA = {5, 7, 3, 9};
        int[] vetB = {2, 4, 10, 8};

        int[] resultadoVetorInvertido = somaInversa(vetA, vetB);

        for (int valor : resultadoVetorInvertido) {
            System.out.print(valor + " ");
        }
    }
}
