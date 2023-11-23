package Desafio5;

public class Principal {
	public static void main(String[] args) {
	Livro book = new Livro("As Viagens de Gulliver", "Jonathan Swift", 446);
	
	System.out.println("O nome do livro é " + book.getNome());
	System.out.println("O autor(a) é " +book.getAutor());
	System.out.println("Existe um total de " + book.getPaginas() + " páginas");
 }
}