package Set.Convidados;

import java.util.Objects;

public class Convidados {
    private String nome;
    private int codigoDoConvite;

    public Convidados(String nome, int codigoDoConvite) {
        this.nome = nome;
        this.codigoDoConvite = codigoDoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoDoConvite() {
        return codigoDoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidados that)) return false;
        return getCodigoDoConvite() == that.getCodigoDoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoDoConvite());
    }

    @Override
    public String toString() {
        return "Convidados{" +
                "nome='" + nome + '\'' +
                ", codigoDoConvite='" + codigoDoConvite + '\'' +
                '}';
    }
}
