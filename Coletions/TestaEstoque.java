package br.com.generation.coletions;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstoque {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
		
		ArrayList<Estoque>estoq = new ArrayList<>();
		
		
		System.out.println("Informe a quantidade de produto que deseja cadastrar: ");
		int cadastro = leia.nextInt();
		 
		
		for(int i = 0; i<cadastro; i++) {
			
			System.out.print("informe o codigo do produto: ");
			int codproduto=leia.nextInt();
			leia.nextLine();
			
			System.out.print("informe o produto: ");
			String produto=leia.nextLine();
			
			
			
			estoq.add(new Estoque(produto,codproduto));
			System.out.println();
			
			}
		
		// imprimir produtos do estoque
		for(int i = 0; i<cadastro; i++) {
			System.out.println(i+1+"º"+estoq.get(i));
			}
		System.out.println();
		
		
		 System.out.println("Deseja excluir algum item da lista?");
		 System.out.println("1 Sim, 2 Não");
		 int remov=leia.nextInt();
		 
		 
		 // Deletar ou não um produto
		 if( remov == 1) {
			 
			 System.out.println("Qual deseja excluir?");
			 int item=leia.nextInt();
			 System.out.println();
			 estoq.remove(item-1);
      	   
         }else if(remov!=2) {
        	 
        	 System.out.println("opção incorreta");
         }else {
        	 
        	 System.out.println("Processo finalizado");
         }
		System.out.println(estoq);
		
		  leia.close();

}

}