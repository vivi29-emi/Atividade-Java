package br.com.generation.POO;

public class clienteEx {

	public static void main(String[] args) {
	
		cliente cadastro= new cliente();
		cliente mercadoria= new cliente();
		cliente cadastro2= new cliente();
		cliente mercadoria2= new cliente();
		
		
		
		
		
		
		cadastro.nome="Maria";
		mercadoria.produto= 0;
	    
		
		cadastro2.nome="Viviane";
		mercadoria2.produto= 0;
	
		
		
		
		mercadoria.compra(30);
		System.out.println("Cara cliente" + cadastro.nome + "!");
		System.out.println(" A quantidade de produto selecionado no carrinho" + mercadoria.produto);
		System.out.println();
		
		mercadoria.devolucao(5);
		System.out.println("Cara cliente" + cadastro.nome + "!");
		System.out.println(" A quantidade de produtos devolvido foram:" + mercadoria.produto);
		System.out.println();
		
		mercadoria2.compra(20);
		System.out.println("Cara cliente" + cadastro2.nome + "!");
		System.out.println(" A quantidade de produto selecionado no carrinho:" + mercadoria2.produto);
		System.out.println();
		
		
		mercadoria2.devolucao(5);
		System.out.println("Cara cliente" + cadastro2.nome + "!");
		System.out.println(" A quantidade de produtos no carrinho" + mercadoria2.produto);
		System.out.println();
		
		
		
		
		
		
		
	     
	}

}
