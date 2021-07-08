package bilboteca;

public class Livro {
	String titulo;
	String autor;
	int ano;
	int id;
	String editora;
	Genero genero;
	String sinopse;
	
	public Livro(String titulo,	String autor, int ano,	int id, String editora,	Genero genero, String sinopse) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.id = id;
		this.editora = editora;
		this.genero = genero;
		this.sinopse = sinopse;		
	}

	public void crialivro() {}
	public void expoeLivro() {}
}
