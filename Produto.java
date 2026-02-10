import java.util.Objects;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome Não pode ser nulo nem vazio. ");
        }
        if (preco <= 0) {
            throw new IllegalArgumentException("Proco não pode ser Negativo nem 0. ");
        }
        if (nome != null) {
            this.nome = nome.toLowerCase();
        }
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produto produto = (Produto) o;

        return preco == produto.preco && nome.equals(produto.nome);

    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }



    }