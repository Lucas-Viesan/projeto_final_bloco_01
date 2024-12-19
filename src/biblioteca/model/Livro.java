package biblioteca.model;

public abstract class Livro {
	
	    private String titulo;
	    private String autor;
	    private String id;
	    
	 //Método construtor 
	    
	    public Livro (String titulo, String autor, String id) {
	    	this.titulo = titulo;
	    	this.autor = autor;
	    	this.id = id;
	    }
	    
		 //Getters e Setters

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}
 

		@Override
	    public String toString() {
	        return "Título: " + titulo + ", Autor: " + autor + ", ID: " + id;
	    }
	    
	    
}
