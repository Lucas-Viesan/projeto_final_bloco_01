package biblioteca.model;



public class LivroDidatico extends Livro {
	private String disciplina;
	private String ano;
	
	public LivroDidatico(String titulo, String autor, String id, String disciplina, String ano) {
		super(titulo, autor, id);
		this.disciplina = disciplina;
		this.ano = ano;
	}
	
	//Getters e Setters

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	
	
	

}
