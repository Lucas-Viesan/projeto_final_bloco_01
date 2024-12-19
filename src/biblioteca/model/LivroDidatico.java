package biblioteca.model;



public class LivroDidatico extends Livro {
	private String disciplina;

	
	public LivroDidatico(String titulo, String autor, String id, String disciplina) {
		super(titulo, autor, id);
		this.disciplina = disciplina;
		
	}
	
	//Getters e Setters

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}


	
	
	 @Override
	    public String toString() {
	        return super.toString() + ", Disciplina: " + disciplina;
	    }
	

}
