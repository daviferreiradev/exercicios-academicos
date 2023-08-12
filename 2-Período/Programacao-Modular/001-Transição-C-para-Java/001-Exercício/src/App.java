// 1 - Faça um programa que leia um vetor A com 15 elementos inteiros. Em seguida, construa um vetor B do mesmo tipo, em que cada elemento de B deva ser o resultado do fatorial correspondente de cada elemento de A. Imprima na tela os vetores A e B.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int tamanhoVetor = 3;
        int[] vetA = new int[tamanhoVetor];
        int[] vetB = new int[tamanhoVetor];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite um número inteiro: ");
            vetA[i] = scanner.nextInt();
        }

        for(int i = 0; i < tamanhoVetor; i++) {
            vetB[i] = calcularFatorial(vetA[i]);
        }

        imprimirVetores(vetA);
        imprimirVetores(vetB);
        
        scanner.close();
    }

    public static int calcularFatorial(int numero) {
        int fatorial = 1;
        for(int i = numero; i > 0; i--) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void imprimirVetores(int[] vet) {
        for(int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
    }
}
