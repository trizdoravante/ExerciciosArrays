package ExArrayMat1;

import java.util.Scanner;

public class ExMat1 {

	public static void main(String[] args) {
		int numeros[][] = new int[3][3];
		Scanner leia = new Scanner(System.in);
		for(int i=0; i<3;i++) {
		for(int j=0; j<3;j++) {
		System.out.println("\nDigite o valor para a posição ["+i+"]["+j+"]");
		numeros[i][j] = leia.nextInt();
		}
		}
		System.out.println("\n Os Elementos da Diagonal Principal são: ");
		int somaDiagonalPrincipal = 0;
		for(int i = 0;i<numeros.length; i++) {
			System.out.println(numeros[i][i]);
			somaDiagonalPrincipal+= numeros[i][i];
		}
		System.out.println("\n\t E a soma destes elementos é igual a: "+somaDiagonalPrincipal);
		
		System.out.println("\n\tE");
		System.out.println("\n Os Elementos da Diagonal Secundária são: ");
		int somaDiagonalSecundaria = 0;
		for(int i = 0;i<numeros.length; i++) {
			int j = numeros.length - 1 - i;
			System.out.println(numeros[i][j]);
			somaDiagonalSecundaria+=numeros[i][j];
		}
		System.out.println("\n\tE a soma destes elementos é igual a: "+somaDiagonalSecundaria);
		
		

	}

}
