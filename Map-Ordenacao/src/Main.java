import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 12), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2021, Month.SEPTEMBER, 12), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2020, Month.JULY, 14), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 12), "Evento 4", "Atração 4");


        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();


    }
}