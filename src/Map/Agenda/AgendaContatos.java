package Map.Agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }
    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Sergio",999592207);
        agendaContatos.adicionarContato("Sergio",999999999);
        agendaContatos.adicionarContato("Sergio1",999592207);
        agendaContatos.adicionarContato("Sergio2",999592207);
        agendaContatos.adicionarContato("Sergio",999592207);
        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Sergio2");
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Sergio"));

    }
}
