package Exercicio_2;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();

        contas.add(new ContaCorrente("Ana", 101, 150));
        contas.add(new ContaPoupanca("Bruno", 102, 200));
        contas.add(new ContaInvestimento("Carlos", 103, 100));

        System.out.println("DEPÓSITOS ");

     
        for (ContaBancaria conta : contas) {
            conta.depositar(1000.00);
        }

        System.out.println("\n=== RENDIMENTO ===");

        ContaPoupanca poupanca = (ContaPoupanca) contas.get(1);
        poupanca.aplicarRendimento(5.0);

        System.out.println("\n=== SAQUES ===");

        
        for (ContaBancaria conta : contas) {
            if (conta instanceof Sacavel) {
                Sacavel sacavel = (Sacavel) conta;
                sacavel.sacar(200.00);
            } else {
                System.out.println(
                    "A conta de " + conta.getTitular()
                    + " não permite saques."
                );
            }
        }

        System.out.println("\n=== SALDOS FINAIS ===");

        for (ContaBancaria conta : contas) {
            conta.exibirDados();
            System.out.println("--------------------");
        }
    }
}
