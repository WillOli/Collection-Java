/*https://github.com/cami-la/collections-java-api-2023/tree/master*/

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicado) {
        livroList.add(new Livro(titulo, autor, anoPublicado));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalorAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicado() >= anoInicial && l.getAnoPublicado() <= anoFinal) {
                    livrosPorIntervalorAnos.add(l);
                }
            }
        }
        return livrosPorIntervalorAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) ;
                {
                    livroPorTitulo = l;
                    break;
                }
            }

        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 1989);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 1990);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1960);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(1960, 2019));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

    }
}
