public class Program {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("William", 1010);
        agendaContatos.adicionarContato("William", 0);
        agendaContatos.adicionarContato("William Oliveira", 111111);
        agendaContatos.adicionarContato("William DIO", 658541);
        agendaContatos.adicionarContato("Maria Silva", 52666152);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("William"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 12512));
    }
}
