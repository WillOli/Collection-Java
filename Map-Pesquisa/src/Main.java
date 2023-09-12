public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2L, "Produto B", 20, 5.0);
        estoqueProdutos.adicionarProduto(3L, "Produto C", 40, 10.10);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
    }
}