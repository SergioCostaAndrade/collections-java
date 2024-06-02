package Map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome,atracao));
    }
    public void exibirAgenda(){
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }
    public void obterProximoEvento() {

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.now(),"Sao Joao","Novinho da Paariba");
        agendaEventos.adicionarEvento(LocalDate.of(2024,12, 22),"Sao Joao","Novinho da Paariba");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 07, 30),"Sao Joao","Novinho da Paariba");
        agendaEventos.exibirAgenda();
    }
}
