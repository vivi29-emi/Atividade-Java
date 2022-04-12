package br.com.generationsequencial01;

import java.lang.Math;
import java.util.Scanner;

public class SequenciaJava06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double x1, x2, y1, y2;
		double p1, p2;
		double d;

		System.out.println("Digite o valor de x do primeiro ponto:\n");
		x1 = entrada.nextDouble();
		System.out.print("Digite o valor de x do primeiro ponto:\n");
		x2 = entrada.nextDouble();
		System.out.println("Digite o valor de y do primeiro ponto:\n");
		y1 = entrada.nextDouble();
		System.out.println("Digite o valor de y do segundo ponto:\n");
		y2 = entrada.nextDouble();

		p1 = x2 - x1;
		p1 = Math.pow(p1, 2.0);
		p2 = y2 - y1;
		p2 = Math.pow(p2, 2.0);
		d = p1 + p2;
		d = Math.pow(d, 2.0);

		System.out.println("A distância entre eles é: " + d);
		
		entrada.close();
	}

}
