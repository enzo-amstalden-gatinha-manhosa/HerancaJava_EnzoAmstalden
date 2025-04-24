// Subclasse de pessoa
public class Funcionario extends Pessoa {
    // Atributos
    String nome;
    double salario;
    String departamento;

    // Construtor da classe Funcionario
    public Funcionario(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(cpf, dataNascimento);
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Exibe todos os dados do funcionário
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }
    // Imprime que o funcionário bateu ponto
    public void baterPonto() {
        System.out.println(nome + " bateu o ponto.");
    }
}