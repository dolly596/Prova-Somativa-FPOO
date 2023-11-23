package Desafio3;

public class Pedido {
	private Long id;
	private String produto;
	private int quantidade;
	
	public Pedido () {
		
	}
	
	public Pedido(long id, String produto, int quantidade) {
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Long getId() {
		return id;
	}
	public String getProduto() {
		return produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
}
