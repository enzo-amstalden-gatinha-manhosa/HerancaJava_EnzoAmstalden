// Subclasse de Funcionario
public class Gerente extends Funcionario {
    // Construtor da classe Gerente
    public Gerente(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(nome, salario, departamento, cpf, dataNascimento);
    }
    // Sobrescreve mostrarDados()
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cargo: Gerente");
    }
    // Imprime que o gerente está em reunião
    public void realizarReuniao() {
        System.out.println(nome + " está realizando uma reunião.");
    }
}