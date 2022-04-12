
//Faça um programa que receba três inteiros e diga qual deles é o maior.

package br.com.generationsequencial01;

import java.util.Scanner;

public class LaconCondicionais01 {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		 int var1,var2,var3;
		 
		 System.out.println("Digite um valor:");
		  var1= entrada.nextInt();
		  System.out.println("Digite um valor:");
		  var2= entrada.nextInt();
		  System.out.println("Digite um valor:");
		  var3= entrada.nextInt();
		  
		 if(var1>var2 && var1>var3) {
			 System.out.println(" o maior valor é:"+var1);
			 
		 }
		 else if(var2>var1 && var2>var3) {
			 System.out.println(" o maior valor é:"+var2);
		 }
		 else if(var3>var2 &&var3>var1 ) {
			 System.out.println(" o maior valor é:"+var3);
		 }
		 
		 else {
			 System.out.println(" fim de jogo");
		 }
		 
		 entrada.close();
		 
		 
			
		  
		

		
		
		
		
		

	}

}
