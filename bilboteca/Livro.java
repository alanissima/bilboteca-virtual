
package bilboteca;

public class Livro{

	private String titulo;
	private String autor;
	private int ano;
	private int id;
	private String editora;
	private Genero genero;
	private String sinopse;
	
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
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public String getSinopse() {
		return sinopse;
	}
	
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	public  void  crialivro () {}
	
	public  void  expoeLivro () {
		System.out.println("Titulo do livro: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("ano: " + ano);
		System.out.println("Editora: " + editora);
		System.out.println("Genero: " + genero);
		System.out.println("Sinopse: " + sinopse);
	}

	public Livro() {}

}