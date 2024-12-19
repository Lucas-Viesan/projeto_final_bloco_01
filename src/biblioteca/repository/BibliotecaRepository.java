package biblioteca.repository;

import biblioteca.model.Livro;

public interface BibliotecaRepository {
    // CRUD para Livro
    void procurarPorID(String id);        
    void listarTodos();                      
    void cadastrar(Livro livro);             
    void atualizar(Livro livro);             
    void deletar(String isbn);               
}

