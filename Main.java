import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Coleta de dados do funcionário
        System.out.println("Cadastro de Funcionário");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Salário: ");
        double salario = scan.nextDouble();
        scan.nextLine();
        System.out.print("Departamento: ");
        String departamento = scan.nextLine();
        System.out.print("CPF: ");
        String cpf = scan.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascimento = scan.nextLine();

        // Menu para o usuário escolher o tipo de funcionário
        System.out.println("Escolha o tipo de funcionário:");
        System.out.println("1 - Gerente");
        System.out.println("2 - Desenvolvedor");
        System.out.println("3 - Estagiário");
        int opcao = scan.nextInt();

        // Com base na escolha, cadastra o funcionário
        Funcionario func;
        switch (opcao) {
            case 1:
                func = new Gerente(nome, salario, departamento, cpf, dataNascimento);
                break;
            case 2:
                func = new Desenvolvedor(nome, salario, departamento, cpf, dataNascimento);
                break;
            case 3:
                func = new Estagiario(nome, salario, departamento, cpf, dataNascimento);
                break;
            default:
                System.out.println("Opção inválida.");
                func = new Funcionario(nome, salario, departamento, cpf, dataNascimento);
        }

        // Exibe os dados do funcionário criado
        System.out.println("\n--- Dados do Funcionário ---");
        func.mostrarDados();
        func.baterPonto();

        scan.close();
    }
}