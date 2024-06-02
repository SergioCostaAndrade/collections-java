package List.CatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        ;
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> listadoAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l: livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    listadoAutor.add(l);
                }
            }
        }
        return listadoAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> listadoIntervaloAno = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l: livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    listadoIntervaloAno.add(l);
                }
            }
        }
        return listadoIntervaloAno;
    }
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l: livroList) {
                if (l.getTítulo().equalsIgnoreCase(titulo)) {
                    livroTitulo = l;
                    break;
                }
            }
        }
        return livroTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Livro 1","Autor 1",2000);
        catalogo.adicionarLivro("Livro 2","Autor 1",2001);
        catalogo.adicionarLivro("Livro 1","Autor 2",2005);
        catalogo.adicionarLivro("Livro 3","Autor 3",2010);
        catalogo.adicionarLivro("Livro 4","Autor 4",2020);
        System.out.println(catalogo.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogo.pesquisarPorTitulo("Livro 1"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2001,2010));
    }

}
