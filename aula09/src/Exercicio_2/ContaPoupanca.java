package Exercicio_2;

public class ContaPoupanca extends ContaBancaria
implements Sacavel {

public ContaPoupanca(String titular, int numero) {
super(titular, numero);
}

@Override
public void sacar(double valor) {
if (valor > 0 && valor <= consultarSaldo()) {
    atualizarSaldo(-valor);
    System.out.println("Saque realizado: R$ " + valor);
} else {
    System.out.println("Saque inválido ou saldo insuficiente.");
}
}

public void aplicarRendimento(double percentual) {
if (percentual > 0) {
    double rendimento = consultarSaldo() * percentual / 100;
    atualizarSaldo(rendimento);
    System.out.println("Rendimento aplicado: R$ " + rendimento);
} else {
    System.out.println("O percentual deve ser positivo.");
}
}
}