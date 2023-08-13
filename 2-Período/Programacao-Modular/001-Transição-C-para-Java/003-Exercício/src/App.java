// 3 - Implemente um programa em Java que receba as informações NOME, SEXO e DATA-NASCIMENTO de no mínimo 10 funcionários de uma determinada empresa e apresente como resultados:
    // A) Um relatório contendo o NOME, SEXO, DATA-NASCIMENTO e a idade de todos os funcionários.
    // B) Ao final do relatório imprimir:
        // 1) a quantidade e o percentual total de funcionários
        // 2) a quantidade e o percentual total de funcionários do sexo feminino
        // 3) a quantidade e o percentual total de funcionários do sexo masculino
        // 4) a idade média geral dos funcionários
        // 5) a idade média dos funcionários do sexo feminino
        // 6) a idade média dos funcionários do sexo masculino

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Funcionarios {
    private String nome;
    private String sexo;
    private LocalDate dataNascimento;
    private int idade;

    public Funcionarios(String nome, String sexo, LocalDate dataNascimento, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numFuncionarios = 4;
        int numSexoMasculino = 0, numSexoFeminino = 0;
        Funcionarios[] funcionarios = new Funcionarios[numFuncionarios];
        for(int i = 0; i < numFuncionarios; i++) {
            System.out.print("Nome do funcionário: ");
            String nome = sc.nextLine();
            System.out.print("Sexo do funcionário(M/F): ");
            String sexo = sc.nextLine();
            if(sexo.equals("M")) {
                numSexoMasculino++;
            } else {
                numSexoFeminino++;
            }

            System.out.print("Data de nascimento do funcionário(Dia/Mês/Ano): ");
            String inputDataNascimento = sc.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataNascimento = LocalDate.parse(inputDataNascimento, formatter);

            LocalDate dataAtual = LocalDate.now();
            Period periodo = Period.between(dataNascimento, dataAtual);
            int idade = periodo.getYears();

            Funcionarios funcionario = new Funcionarios(nome, sexo, dataNascimento, idade);
            funcionarios[i] = funcionario;
        }

        int somaIdadeGeral = 0, somaIdadeMasculino = 0, somaIdadeFeminino = 0;
        float idadeMediaGeral = 0, idadeMediaMasculino = 0, idadeMediaFeminino = 0;
        for(Funcionarios funcionario: funcionarios) {
            System.out.println();
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Sexo: " + funcionario.getSexo());
            System.out.println("Data de nascimento: " + funcionario.getDataNascimento());
            System.out.println("Idade: " + funcionario.getIdade());
            System.out.println();

            somaIdadeGeral += funcionario.getIdade();

            if((funcionario.getSexo()).equals("M")) {
                somaIdadeMasculino += funcionario.getIdade();
            } else {
                somaIdadeFeminino += funcionario.getIdade();
            }
        }

        idadeMediaGeral = (float) somaIdadeGeral / numFuncionarios;
        idadeMediaMasculino = (float) somaIdadeMasculino / numSexoMasculino;
        idadeMediaFeminino = (float) somaIdadeFeminino / numSexoFeminino;

        System.out.printf("Número total de funcionários: %d (100,00%%)\n", numFuncionarios);
        System.out.printf("Número de funcionários do sexo Masculino: %d (%.2f%%)\n", numSexoMasculino, ((float) numSexoMasculino / numFuncionarios) * 100);
        System.out.printf("Número de funcionários do sexo Feminino: %d (%.2f%%)\n", numSexoFeminino, ((float) numSexoFeminino / numFuncionarios) * 100);
        System.out.printf("Idade média geral dos funcionários: %.2f\n", idadeMediaGeral);
        System.out.printf("Idade média dos funcionários do sexo masculino: %.2f\n", idadeMediaMasculino);
        System.out.printf("Idade média dos funcionários do sexo feminino: %.2f\n", idadeMediaFeminino);

        sc.close();
    }
}
