package Ex2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Projeto projeto1 = new Projeto(
            "Landing Page",
            "Desenvolvendo uma landing page."
        );

        Projeto projeto2 = new Projeto(
            "App",
            "Criação de um aplicativo"
        );

        Desenvolvedor desenvolvedor = new Desenvolvedor(
            "PHP",
            50000.00,
            projeto1,
            "PHP"
        );

        Designer designer = new Designer(
            "Castrin",
            5000.00,
            projeto2,
            "Figma"
        );

        Gerente gerente = new Gerente(
            "Leandro",
            80000.00,
            projeto1
        );

        gerente.adicionarFuncionario(desenvolvedor);
        gerente.adicionarFuncionario(designer);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(desenvolvedor);
        funcionarios.add(designer);
        funcionarios.add(gerente);

        System.out.println("* FUNCIONÁRIOS *");
        System.out.println();

        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirDados();
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        }

        System.out.println("\n* FUNCIONÁRIOS TRABALHANDO *");
        System.out.println();

        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Trabalhavel) {
                Trabalhavel trabalhador = (Trabalhavel) funcionario;
                trabalhador.trabalhar();
            }
        }
    }
}