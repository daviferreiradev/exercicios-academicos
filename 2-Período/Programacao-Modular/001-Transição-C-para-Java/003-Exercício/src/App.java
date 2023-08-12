// 3 - Implemente um programa em Java que receba as informações NOME, SEXO e DATA-NASCIMENTO de no mínimo 10 funcionários de uma determinada empresa e apresente como resultados:
// Um relatório contendo o NOME, SEXO, DATA-NASCIMENTO e a idade de todos os funcionários.
// Ao final do relatório imprimir:
// 1) a quantidade e o percentual total de funcionários
// 2) a quantidade e o percentual total de funcionários do sexo feminino
// 3) a quantidade e o percentual total de funcionários do sexo masculino
// 4) a idade média geral dos funcionários
// 5) a idade média dos funcionários do sexo feminino
// 6) a idade média dos funcionários do sexo masculino

import java.util.Scanner;

class Funcionarios {
    private String nome;
    private String sexo;
    private String dataNascimento;

    public Funcionarios(String nome, String sexo, String dataNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        int numFuncionarios = 2;
        String nome;
        String sexo;
        String dataNascimento;

        Funcionarios[] funcionario = new Funcionarios[10];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < numFuncionarios; i++) {
            System.out.print("Nome do " + (i + 1) + "° funcionário: ");
            nome = scanner.nextLine();

            System.out.print("Sexo do " + (i + 1) + "° funcionário: ");
            sexo = scanner.nextLine();

            System.out.print("Data de nascimento do " + (i + 1) + "° funcionário: ");
            dataNascimento = scanner.nextLine();
        
            funcionario[i] = new Funcionarios(nome, sexo, dataNascimento);
        }
        
        for(int i = 0; i < numFuncionarios; i++) {
            System.out.println("\n" + funcionario[i].getNome());
            System.out.println(funcionario[i].getSexo());
            System.out.println(funcionario[i].getDataNascimento());
        }
        scanner.close();
    }
}


