package Exercicio_2;

public class ContaCorrente extends ContaBancaria
implements Sacavel {

public ContaCorrente(String titular, int numero) {
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
}