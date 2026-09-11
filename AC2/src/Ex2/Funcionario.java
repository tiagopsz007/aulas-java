package Ex2;

public abstract class Funcionario {
    private String nome;
    private double salario;
    private Projeto projeto;

    public Funcionario(String nome, double salario, Projeto projeto) {
        this.nome = nome;
        this.salario = salario;
        this.projeto = projeto;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public abstract double calcularBonus();

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Projeto: " + projeto.getNome());
        System.out.println("Descrição do projeto: " + projeto.getDescricao());
        System.out.println("Bônus: R$ " + calcularBonus());
    }
}