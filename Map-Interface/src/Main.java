public class Main {
    public static void main(String[] args) {
       AgendaContatos agendaContatos = new AgendaContatos();

       agendaContatos.adicionarContato("William", 3463114);
       agendaContatos.adicionarContato("William", 556655);
       agendaContatos.adicionarContato("William Oliveira", 5594);
       agendaContatos.adicionarContato("William DIO", 654987);
       agendaContatos.adicionarContato("William Silva", 665541);
       agendaContatos.adicionarContato("William", 44444);


       agendaContatos.exibirContato();

       agendaContatos.removerContato("William");
       agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("William DIO"));


    }
}