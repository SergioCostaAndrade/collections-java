package Set.Convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidados> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidados(nome,codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidados convidadoParaRemover = null;
        for (Convidados c: convidadosSet) {
            if (c.getCodigoDoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }
    public int contarConvidados() {
        return convidadosSet.size();
    }
    public Set <Convidados> exibirConvidados() {
        return convidadosSet;
    }
    //public void exibirConvidados() {
    //    System.out.println(convidadosSet);
    //}

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 1234);
        System.out.println(conjuntoConvidados.exibirConvidados());
        System.out.println(conjuntoConvidados.contarConvidados());
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println(conjuntoConvidados.exibirConvidados());
        System.out.println(conjuntoConvidados.contarConvidados());

    }
}
