package Ex2;

import java.util.ArrayList;

public class Gerente extends Funcionario implements Trabalhavel {
    private ArrayList<Funcionario> equipe;

    public Gerente(String nome, double salario, Projeto projeto) {
        super(nome, salario, projeto);
        equipe = new ArrayList<>();
    }

    public double calcularBonus() {
        return getSalario() * 0.15;
    }

    public void trabalhar() {
        System.out.println(
            "Gerente " + getNome() +
            " está trabalhando em: " +
            getProjeto().getNome() + "."
        );
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        equipe.add(funcionario);
    }

    public void listarEquipe() {
        if (equipe.isEmpty()) {
            System.out.println("Não há funcionários na equipe.");
        } else {
            System.out.println("Funcionários da equipe:");

            for (Funcionario funcionario : equipe) {
                System.out.println("- " + funcionario.getNome());
            }
        }
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantidade de funcionários na equipe: " + equipe.size());
    }
}