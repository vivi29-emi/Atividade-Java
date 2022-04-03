/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
 * * 10-14 infantil.
 * * 15-17 juvenil.
 * * 18-25 adulto *\
 */


package br.com.generationsequencial01;

import java.util.Scanner;

public class LacosCondicionais03 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int idade;
		
		    System.out.println("Digite a sua idade:");
		    idade= leia.nextInt();
		    
		if(idade>10 && idade<=14) {
			System.out.println("sua idade é"+idade+" categoria infantil");
		
		} else if(idade>15 && idade<=17) {
			System.out.println("sua idade é"+idade+" categoria juvenil");
		}
		else if(idade>18 && idade<=25) {
			System.out.println("sua idade é"+idade+" categoria adulto");
		}
		 
		else {
			System.out.println("Você ja é velho!!");
		}
		
		leia.close(); 
	}
 
}
