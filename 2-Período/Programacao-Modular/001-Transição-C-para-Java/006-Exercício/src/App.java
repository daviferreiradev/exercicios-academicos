// 6. Faça um procedimento que recebe 3 valores inteiros por parâmetro e os exiba em ordem crescente. Faça um programa que leia N conjuntos de 3 valores e acione o procedimento para cada conjunto (N deve ser lido do teclado).


import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void ordenarVetorCrescente(int[] vetOriginal) {
        Arrays.sort(vetOriginal);
        System.out.print("\nVetor ordenado de forma crescente: " + Arrays.toString(vetOriginal) + "\n\n");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numVetores;
        System.out.print("Quantos vetores você quer colocar em ordem crescente? ");
        numVetores = sc.nextInt();

        int tamVetor = 3;
        int[] vetOriginal = new int[tamVetor];
        for(int i = 0; i < numVetores; i++) {
            for(int j = 0; j < tamVetor; j++) {
                System.out.print("Vetor " + (i + 1) + " - Indice " + j + ": ");
                vetOriginal[j] = sc.nextInt();
            }
            ordenarVetorCrescente(vetOriginal);
        }
        sc.close();
    }
}
