package br.com.generationsequencial01;

import java.util.Scanner;

public class SequencialJava01 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int Dias,Meses,Ano,DiasAno= 365,DiaMes=30;
		
		System.out.println("informa sua idade:\n");
		 Ano=entrada.nextInt();
		 
		 
		System.out.println("meses:");
		 Meses=entrada.nextInt();
		  
		 System.out.println("Dias:");
		 Dias=entrada.nextInt();
		
		 Dias = (Ano*DiasAno)+ (Meses * DiaMes)+ Dias;
        
		 System.out.println("Sua idade em dias é:" +Dias);
		 
		 entrada.close();
	}

}
