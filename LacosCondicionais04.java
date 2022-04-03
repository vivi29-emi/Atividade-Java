

package br.com.generationsequencial01;

import java.util.Scanner;

public class LacosCondicionais04 {
  public static void main(String[] args) {
	  Scanner leia= new Scanner(System.in);
	  int  n;
	  System.out.println("Digite um valor:");
	  n=leia.nextInt();
	  
	 if(n%2==0){
		 System.out.println("O numero é par");
	 }
	 else if(n%2!=0) {
		 System.out.println("O numero é impar");
	 }
	  
	 leia.close();
}
}
