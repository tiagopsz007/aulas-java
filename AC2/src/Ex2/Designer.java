package Ex2;

public class Designer extends Funcionario implements Trabalhavel {
    private String ferramentaPrincipal;

    public Designer(String nome, double salario, Projeto projeto,
                    String ferramentaPrincipal) {
        super(nome, salario, projeto);
        this.ferramentaPrincipal = ferramentaPrincipal;
    }

    public String getFerramentaPrincipal() {
        return ferramentaPrincipal;
    }

    public double calcularBonus() {
        return getSalario() * 0.08;
    }

    public void trabalhar() {
        System.out.println(
            "Designer: " + getNome() +
            " - " + ferramentaPrincipal +
            " na aplicação: " + getProjeto().getNome() + "."
        );
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Ferramenta principal: " + ferramentaPrincipal);
    }
}