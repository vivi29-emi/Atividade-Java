

package br.com.generation.POO;


public class cliente {
        
	String nome;
	int produto;
	int imprimir;
    
    
	
	void compra(int pegar) {
		produto= produto+ pegar;
		
		
	}
	void devolucao(int devolver) {
		produto= produto - devolver;
		System.out.println("Quantidade de produto devolvido: " + devolver);
	}
	
	
	
	
}
