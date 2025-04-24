// Subclasse de funcionario
public class Estagiario extends Funcionario {
    // Construtor da classe Estagiario
    public Estagiario(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(nome, salario, departamento, cpf, dataNascimento);
    }
    // Sobrescreve o método mostrarDados()
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cargo: Estagiário");
    }
    // Imprime que o estagiário está realizando uma tarefa
    public void fazerTarefa() {
        System.out.println(nome + " está fazendo uma tarefa.");
    }
}