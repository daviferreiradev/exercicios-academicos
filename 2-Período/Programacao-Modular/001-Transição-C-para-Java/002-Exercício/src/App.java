// 2 - Elabore um programa que preencha com 10 elementos do tipo inteiro em um vetor A. Crie um vetor ParImpar de 2 posições e armazene no índice 0 quantos elementos de A são par e no índice 1 quantos elementos de A são ímpar. Ao final, imprima o vetor ParImpar.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int tamanhoVetor = 5;
        int numPares = 0, numImpares = 0;
        int[] vetA = new int[tamanhoVetor];
        int[] parImpar = new int[2];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite um número: ");
            vetA[i] = sc.nextInt();

            if(vetA[i] % 2 == 0) {
                numPares++;
            } else {
                numImpares++;
            }
        }

        parImpar[0] = numPares;
        parImpar[1] = numImpares;

        System.out.println("Total de números pares: " + parImpar[0]);
        System.out.println("Total de números ímpars: " + parImpar[1]);

        sc.close();
    }
}
