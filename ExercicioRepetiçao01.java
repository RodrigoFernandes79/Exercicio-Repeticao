package aula04;

import java.util.Scanner;

public class ExercicioRepeti�ao01 {

	public static void main(String[] args) {
		/*For: 
�Escreva
um programa, usando for, que mostre seu nome 10 vezes na tela;
*/
		Scanner tc = new Scanner(System.in);
		System.out.println("Ol�!Digite o seu nome:");
		String nome = tc.nextLine();
		for(int i=0;i<10;i++) {
			System.out.println(nome);
		}

	}

}
