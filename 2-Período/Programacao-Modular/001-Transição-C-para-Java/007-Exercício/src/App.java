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



// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);

//         int tamanhoVetor;
//         System.out.print("Qual o tamanho dos vetores? ");
//         tamanhoVetor = sc.nextInt();
        
//         int vetA[] = new int[tamanhoVetor];
//         for(int i = 0; i < tamanhoVetor; i++) {
//             System.out.printf("Vetor A - Valor do indice %d: ", i);
//             vetA[i] = sc.nextInt();
//         }

//         int vetB[] = new int[tamanhoVetor];
//         for(int i = 0; i < tamanhoVetor; i++) {
//             System.out.printf("Vetor B - Valor do indice %d: ", i);
//             vetB[i] = sc.nextInt();
//         }

//         int vetResultado[] = new int[tamanhoVetor];
//         for(int i = 0; i < tamanhoVetor; i++) {
//             vetResultado[i] = vetA[i] + vetB[i];
//         }

//         // Imprime os vetores
//         for(int i = 0; i < tamanhoVetor; i++) {
//             System.out.print(vetA[i] + " ");
//         }
//         System.out.print("\n\n");

//         for(int i = 0; i < tamanhoVetor; i++) {
//             System.out.print(vetB[i] + " ");
//         }
//         System.out.print("\n\n");

//         for(int i = tamanhoVetor - 1; i >= 0; i--) {
//             System.out.print(vetResultado[i] + " ");
//         }

//         sc.close();
//     }
// }