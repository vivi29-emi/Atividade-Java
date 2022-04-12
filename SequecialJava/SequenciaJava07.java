package br.com.generationsequencial01;

import java.util.Scanner;

public class SequenciaJava07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double a,b,c,d,e,f,g,j,x,y;
		
		System.out.println("Digite o valor de a: ");
		a= entrada.nextDouble();
		System.out.println("Digite o valor de b: ");
		b= entrada.nextDouble();
		System.out.println("Digite o valor de c: ");
		c= entrada.nextDouble();
		System.out.println("Digite o valor de d: ");
		d = entrada.nextDouble();
		System.out.println("Digite o valor de d: ");
		e = entrada.nextDouble();
		System.out.println("Digite o valor de d: ");
		f = entrada.nextDouble();
		System.out.println("Digite o valor de d: ");
		g = entrada.nextDouble();
		System.out.println("Digite o valor de d: ");
		j= entrada.nextDouble();
		
		
		
		x = c*j-b*f/(a*j-b*d);
	    y = a*f-c*d/a*j-b*d;
		
		System.out.println("O valor de x é "+ x + " e y é"+y);
			

	}

}
