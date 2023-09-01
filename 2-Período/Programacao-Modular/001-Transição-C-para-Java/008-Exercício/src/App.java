// 8 -  Considere a Matriz A abaixo:
    // 5    10    7    8
    // 13    4    1    3
    // 9     2    6    5
    // 10    7    4    9
// A) Implemente um algoritmo que exiba a matriz transposta AT
// B) Implemente um algoritmo que exiba a soma dos quadrados da diagonal secundária
// C) Implemente um algoritmo que faça a multiplicação desta matriz por uma constante C
// D) Implemente um algoritmo que inverta a 3ª linha com a 3ª coluna


public class App {
    public static void main(String[] args) {
        int[][] matrizA = {
            {5, 10, 7, 8},
            {13, 4, 1, 3},
            {9, 2, 6, 5},
            {10, 7, 4, 9}
        };

        // A) Exibir a matriz transposta AT
        int[][] matrizAT = new int[matrizA[0].length][matrizA.length];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizAT[j][i] = matrizA[i][j];
            }
        }

        System.out.println("Matriz Transposta AT:");
        for (int i = 0; i < matrizAT.length; i++) {
            for (int j = 0; j < matrizAT[0].length; j++) {
                System.out.print(matrizAT[i][j] + " ");
            }
            System.out.println();
        }

        // B) Exibir a soma dos quadrados da diagonal secundária
        int somaQuadradosDiagonalSecundaria = 0;

        for (int i = 0; i < matrizA.length; i++) {
            somaQuadradosDiagonalSecundaria += matrizA[i][matrizA.length - 1 - i] * matrizA[i][matrizA.length - 1 - i];
        }

        System.out.println("Soma dos quadrados da diagonal secundária: " + somaQuadradosDiagonalSecundaria);

        // C) Multiplicação da matriz por uma constante C
        int c = 2; // Constante

        int[][] matrizMultiplicada = new int[matrizA.length][matrizA[0].length];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizMultiplicada[i][j] = matrizA[i][j] * c;
            }
        }

        System.out.println("Matriz Multiplicada por " + c + ":");
        for (int i = 0; i < matrizMultiplicada.length; i++) {
            for (int j = 0; j < matrizMultiplicada[0].length; j++) {
                System.out.print(matrizMultiplicada[i][j] + " ");
            }
            System.out.println();
        }

        // D) Invertendo a 3ª linha com a 3ª coluna
        for (int i = 0; i < matrizA.length; i++) {
            int temp = matrizA[i][2];
            matrizA[i][2] = matrizA[2][i];
            matrizA[2][i] = temp;
        }

        System.out.println("Matriz após a inversão da 3ª linha com a 3ª coluna:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
    }
}

