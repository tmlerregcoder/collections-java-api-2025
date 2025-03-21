package com.estudo.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            return livroList.stream()
                    .filter(livro -> livro.getAutor().equalsIgnoreCase(autor))
                    .toList();
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            return livroList.stream()
                    .filter(livro -> livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal)
                    .toList();
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        return livroList.stream()
                .filter(livro -> livro.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 1", 2022);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 2020);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 2", 2023);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 4", 2024);
        catalogoLivros.adicionarLivro("Livro 7", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro 8", "Autor 3", 2022);
        catalogoLivros.adicionarLivro("Livro 9", "Autor 2", 2023);
        catalogoLivros.adicionarLivro("Livro 10", "Autor 4", 2024);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1")+"\n\n");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022)+"\n\n");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }

}
