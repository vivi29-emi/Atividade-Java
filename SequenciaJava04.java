package br.com.generationsequencial01;

import java.util.Scanner;

public class SequenciaJava04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a, b, c, d, r, s;

		System.out.println("Escreva A:");
		a = entrada.nextInt();
		System.out.println("Escreva B:");
		b = entrada.nextInt();
		System.out.println("Escreva C:");
		c = entrada.nextInt();

		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (r + s) / 2;
   
		System.out.println("O resultado da expressão é: " + d);
		
		entrada.close();
	}

}
