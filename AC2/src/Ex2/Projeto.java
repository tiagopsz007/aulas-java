package Ex2;

public class Projeto {
    private String nome;
    private String descricao;

    public Projeto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void exibirDados() {
        System.out.println("Projeto: " + nome);
        System.out.println("Descrição: " + descricao);
    }
}