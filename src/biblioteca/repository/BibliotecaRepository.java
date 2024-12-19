package biblioteca.repository;
import java.util.List;
import biblioteca.model.Livro;

public interface BibliotecaRepository {
    // CRUD para Livro
    void procurarPorID(String isbn);        
    void listarTodos();                      
    void cadastrar(Livro livro);             
    void atualizar(Livro livro);             
    void deletar(String isbn);               
}

