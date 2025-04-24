// Subclasse de funcionario
public class Desenvolvedor extends Funcionario {
    // Classe Desenvolvedor
    public Desenvolvedor(String nome, double salario, String departamento, String cpf, String dataNascimento) {
        super(nome, salario, departamento, cpf, dataNascimento);
    }
    // Sobrescreve o método mostrarDados()
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cargo: Desenvolvedor");
    }
    // Imprime uma mensagem que o desenvolvedor está programando
    public void programar() {
        System.out.println(nome + " está programando.");
    }
}
