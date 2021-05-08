package aula04;

import java.util.Scanner;

public class ExercicioRepetiçao {

	public static void main(String[] args) {
		/*While: 
•Escreva
um programa, usando while,
que mostre seu nome 10 vezes na tela;
		 */
		
		Scanner tc=new Scanner(System.in);
		System.out.println("Olá! Escreva seu nome: ");
		String nome =tc.nextLine();
		int n=0;
		while(n<10) {
			System.out.println(nome);
			n++;
		}
		tc.close();	
	}

}
