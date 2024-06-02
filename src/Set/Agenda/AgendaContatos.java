package Set.Agenda;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contatos> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contatos(nome, numero));
    }
    public void exibirContatos() {
        System.out.println(contatosSet);
    }
    public Set<Contatos> pesquisarPorNome(String nome) {
        Set<Contatos> contatosPorNome = new HashSet<>();
        for (Contatos c: contatosSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contatos atualizarNumeroContato(String nome, int novoNumero) {
        Contatos contatoAtualizado = null;
        for (Contatos c: contatosSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Sergio", 999592207);
        agendaContatos.adicionarContato("Sergio Costa", 999592207);
        agendaContatos.adicionarContato("Sergio Andrade", 999592207);
        agendaContatos.adicionarContato("Sergio Costa Andrade", 999592207);
        agendaContatos.adicionarContato("Silvio Costa Andrade", 999592207);
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Sergio Costa"));
        System.out.println(agendaContatos.atualizarNumeroContato ("Sergio Costa",97112781));
    }

}
