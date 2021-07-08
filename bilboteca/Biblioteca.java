package bilboteca;

/**
 * @authors Alana Brand�o e Nicolly Tavassi
 *
 */

public class Biblioteca implements Busca{

	public Biblioteca() {
		// TODO Auto-generated constructor stub
	}String titulo;
	String autor;
	int ano;
	int id;
	String editora;
	Genero genero;
	String sinopse;
	
	public void criaLivro() {
		Livro l001 = new Livro("1984","George Orwell",1949,001,"Secker and Warburg",new Ficcao(),"Um homem perde sua identidade vivendo sob um regime repressivo. Nesta história baseada no clássico de George Orwell, Winston Smith (John Hurt) é um funcionário público cuja função é reescrever a história de forma a colocar os líderes de um país fictício sob uma luz positiva. As escapadelas românticas com Julia (Suzanna Hamilton) proporcionam sua única fonte de distração, mas os políticos desaprovam o relacionamento. Numa sociedade monitorada de perto, não há como escapar do Grande Irmão.");
		l001.genero.tipo = "Utópico"; // pq nao da certo???????????????????
		
		Livro l002 = new Livro("A hora da Estrela","Clarice Lispector",1977,002,"Rocco",new Nacional(),"Macabéa, uma nordestina de dezenove anos, orfã de pai, mãe e da tia que a criou, vai para São Paulo ser datilógrafa. Ela mora em uma pensão e tem uma vida sem muitas emoções, pois é indiferente a elas. Conhece Olímpico de Jesus e os dois começam a namorar. Porém, a relação não se sustenta e Olímpico acaba trocando Macabéa por Glória, colega de trabalho da ex-namorada, que, por recomendação de sua cartomante, rouba o namorado de Macabéa.");
		
		Livro l003 = new Livro("Assassinato no Expresso do Oriente","Agatha Christie",1934,003,"Collins Crime Club",new Romance(),"Ocorre um assassinato em um luxuoso trem. O famoso detetive Hercule Poirot, que também estava a bordo, precisa correr contra o tempo para resolver o caso.");
	}
	public void buscaLivro(){}
	public void buscaAutor(){}
	public void buscaGenero(){}
	public void buscaAno(){}
	public void expoeLivro(){
		System.out.println(l001.titulo);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
