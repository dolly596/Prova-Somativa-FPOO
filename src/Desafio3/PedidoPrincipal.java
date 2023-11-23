package Desafio3;

import java.util.Scanner;

public class PedidoPrincipal {
	public static void main(String[] args) {
		
	Pedido encomenda = new Pedido();
	Pedido encomenda2 = new Pedido(1,"Led", 1);
	
	
	System.out.println(encomenda2.getId());
	System.out.println(encomenda2.getProduto());
	System.out.println(encomenda2.getQuantidade());
}
}