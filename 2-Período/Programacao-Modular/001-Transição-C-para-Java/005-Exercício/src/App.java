// 5 - A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados sobre o salário e número de filhos. Faça um método que leia esses dados para um número não determinado de pessoas, calcule e exiba a média de salário da população (a condição de parada pode ser um flag ou a quantidade N). Faça um programa que acione o método.


import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numHabitantes;
        float somaSalario = 0.0f;

        System.out.print("Quantos habitantes você quer cadastrar? ");
        numHabitantes = scanner.nextInt();

        for (int i = 0; i < numHabitantes; i++) {
            System.out.printf("Salário do %dº habitante: ", i + 1);
            float salario = scanner.nextFloat();

            System.out.printf("Quantidade de filhos do %dº habitante: ", i + 1);
            int numFilhos = scanner.nextInt();

            somaSalario += salario;
        }

        scanner.close();

        float mediaSalario = somaSalario / numHabitantes;
        System.out.println("Média de salário da população: R$" + mediaSalario);
    }
}

