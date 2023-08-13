// 4 - Faça um método que recebe as 3 notas de um aluno por parâmetro e uma letra. Se a letra for ‘A’, o procedimento calcula e escreve a média aritmética das notas do aluno, se for ‘P’, calcula e escreve a sua média ponderada (pesos: 5, 3 e 2). Faça um programa que leia 3 notas de N alunos e acione o procedimento para cada aluno (N deve ser lido do teclado).


import java.util.Scanner;

public class App {

    public static void calcularMediaAritmeticaOuPonderada(float[] notasAluno, String tipoMedia, int numAlunos, int numProvas) {
        float somaTotalNotas = 0;

        if(tipoMedia.equals("A")) {
            for(int i = 0; i < numProvas; i++) {
                somaTotalNotas += notasAluno[i];
            }
            float mediaAritmetica = somaTotalNotas / numProvas;
            System.out.printf("Média aritmética: %.2f\n\n", mediaAritmetica);

        } else if (tipoMedia.equals("P")) {
            float mediaPonderada = ((notasAluno[0] * 5) + (notasAluno[1] * 3) + (notasAluno[2] * 2)) / 10;
            System.out.printf("Média Ponderada: %.2f\n\n", mediaPonderada);

        } else {
            System.out.println("Tipo de média inválida!");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String tipoMedia;
        int numProvas = 3, numAlunos = 0;
        float notasAlunos[] = new float[numProvas];

        System.out.printf("Quantos alunos você deseja cadastrar? ");
        numAlunos = scanner.nextInt();

        for(int i = 0; i < numAlunos; i++) {
            for(int j = 0; j < numProvas; j++) {
                System.out.printf("Aluno %d - Prova %d: ", (i + 1), (j + 1));
                notasAlunos[j] = scanner.nextFloat();
                // Consumir a nova linha pendente
                scanner.nextLine();
            }

            System.out.println("Qual tipo de média você deseja calcular? (A)ritmética ou (P)onderada? ");
            tipoMedia = scanner.nextLine();

            calcularMediaAritmeticaOuPonderada(notasAlunos, tipoMedia, numAlunos, numProvas);
        }

        scanner.close();
    }
}
