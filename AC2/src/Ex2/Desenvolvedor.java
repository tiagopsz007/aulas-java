package Ex2;

public class Desenvolvedor extends Funcionario implements Trabalhavel {
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, double salario, Projeto projeto,
                         String linguagemPrincipal) {
        super(nome, salario, projeto);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public double calcularBonus() {
        return getSalario() * 0.10;
    }

    public void trabalhar() {
        System.out.println(
            "Desenvolvedor " + getNome() +
            " está desenvolvendo em: " + linguagemPrincipal +
            " no projeto " + getProjeto().getNome() + "."
        );
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Linguagem principal: " + linguagemPrincipal);
    }
}