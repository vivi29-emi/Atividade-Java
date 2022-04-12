package br.com.generationsequencial01;

import java.util.Scanner;

public class SequenciaJava02 {

	
		public static void main(String[] args) {
			Scanner entrada= new Scanner(System.in);
			int IdadeAnos,IdadeMeses,IdadeDias,TotalDias;
			
			System.out.println("Digite a quantidade de dias:");
			 TotalDias=entrada.nextInt();
			 
			 IdadeAnos = TotalDias/365;

						TotalDias = TotalDias%365;

						IdadeMeses = TotalDias/30;

						TotalDias = TotalDias%30;

						IdadeDias = TotalDias;
			System.out.println("A idade é : " + IdadeAnos + " anos");
			System.out.println("\nA quantidade de meses é : " + IdadeMeses + " meses");
			System.out.println("\n A quantidade de dias é : " + IdadeDias + " dias");
			
        entrada.close();
		}


	}
	

