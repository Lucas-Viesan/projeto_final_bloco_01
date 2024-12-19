package biclioteca.controller;

import java.util.ArrayList;
import java.util.List;
import biblioteca.model.Livro;
import biblioteca.repository.BibliotecaRepository;


public class LivroController implements BibliotecaRepository {
	private List<Livro> livros = new ArrayList<>();

    @Override
    public void procurarPorID(String id) {
        Livro livro = livros.stream()
                            .filter(l -> l.getId().equals(id))
                            .findFirst()
                            .orElse(null);
        if (livro != null) {
            System.out.println(livro);
        } else {
            System.out.println("Livro não encontrado!");
        }
    }

    @Override
    public void listarTodos() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            livros.forEach(System.out::println);
        }
    }

    @Override
    public void cadastrar(Livro livro) {
        if (livros.stream().anyMatch(l -> l.getId().equals(livro.getId()))) {
            System.out.println("Livro com este ID já existe!");
        } else {
            livros.add(livro);
            System.out.println("Livro cadastrado com sucesso!");
        }
    }

    @Override
    public void atualizar(Livro livro) {
        Livro livroExistente = livros.stream()
                                     .filter(l -> l.getId().equals(livro.getId()))
                                     .findFirst()
                                     .orElse(null);
        if (livroExistente != null) {
            livros.remove(livroExistente);
            livros.add(livro);
            System.out.println("Livro atualizado com sucesso!");
        } else {
            System.out.println("Livro não encontrado!");
        }
    }

    @Override
    public void deletar(String id) {
        Livro livro = livros.stream()
                            .filter(l -> l.getId().equals(id))
                            .findFirst()
                            .orElse(null);
        if (livro != null) {
            livros.remove(livro);
            System.out.println("Livro deletado com sucesso!");
        } else {
            System.out.println("Livro não encontrado!");
        }
    }
}
