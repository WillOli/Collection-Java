public class Program {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidados("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidados("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidados("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidados("Convidado 4", 1236);
        conjuntoConvidados.adicionarConvidados("Convidado 5", 1237);


        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
//
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
//        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
//
        conjuntoConvidados.exibirConvidados();

    }


}
