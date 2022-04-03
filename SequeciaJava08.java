package br.com.generationsequencial01;

import java.util.Scanner;

public class SequeciaJava08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double CustoFabrica, CustoConsumidor, distribuidor;
		

		System.out.println("Entre com o custo de fabrica:");
		CustoFabrica=entrada.nextDouble();
		
		distribuidor=CustoFabrica + (CustoFabrica*0.28);
		CustoConsumidor= distribuidor + (distribuidor*0.45);
		
		System.out.println("Custo do consumidor: " + CustoConsumidor);
		
	}

}
