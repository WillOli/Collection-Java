/*https://github.com/cami-la/collections-java-api-2023/tree/master*/
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atribuo lista tarefa
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalDeTarefas() {
        return tarefaList.size();
    }
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalDeTarefas());


        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 3");

        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.removerTarefa("Tarefa 3");
        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.obterDescricoesTarefas();


    }

}
