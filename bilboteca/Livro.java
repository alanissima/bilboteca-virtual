package bilboteca;

public class Livro extends Biblioteca{

	
	
	 public Livro ( String  titulo ,String  autor , int  ano ,	 int  id , String  editora ,	 Genero  genero , String  sinopse ) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.id = id;
		this.editora = editora;
		this.genero = genero;
		this.sinopse = sinopse;		
	}

	public  void  crialivro () {
	
		
	}
	public  void  expoeLivro () {
		System.out.println("Titulo do livro: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("ano: " + ano);
		System.out.println("Editora: " + editora);
		System.out.println("Genero: " + genero);
		System.out.println("Sinopse: " + sinopse);
	}

}
