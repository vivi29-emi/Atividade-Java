//Faça um programa que entre com três números e coloque em ordem crescente.

package br.com.generationsequencial01;

import java.util.Arrays;
import java.util.Scanner;

public class LacosCondicionais02 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int []listaDeNumeros = new int[5];
		                  
		
		           // Preenche o Array a parti da posição 1
		           for (int i = 1; i < listaDeNumeros.length; i++) 
		           {
			           System.out.print("Digite "+ i + "° numeros: "); 
			           listaDeNumeros[i] = entrada.nextInt();
			       }
		           
		           // Coloca o Array em ordem crescente
		           Arrays.sort(listaDeNumeros);
		           
		           // Lista o Array em ordem crescente
		          System.out.print("Ordem crescente:    "); 
		       	  for (int i = 1; i < listaDeNumeros.length; i++) 
		       	  {
		       		System.out.print(listaDeNumeros[i]+ "  ");       		
				  }
		       	entrada.close();   	  

	}

}
