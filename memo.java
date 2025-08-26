package tarea1;

import java.util.Scanner;

public class memo {

	public static void main(String[] args) {
		int[] num = new int[16];
		int neg = 0;
		Scanner captura = new Scanner(System.in);
		
		System.out.println("Dame 15 Numeros");
		
		for(int i=1; i < num.length; i++) {
			System.out.println("Numero "+ i + ": ");
			num[i]= captura.nextInt();
		}
		
		System.out.println("Resultados:");
		for(int i=0; i < num.length; i++ ) {
			if(num[i]%2 == 0) {
				double raiz = Math.sqrt(num[i]);
	            if (raiz == (int) raiz && num[i] > 0) {
	                System.out.println("√" + num[i] + " = " + (int) raiz);
	            }
	        }
	    }
		System.out.println(" ");
		for(int i=0; i < num.length; i++) {
			if(num[i] < 0) {
				neg++;
			}
			
		}
		System.out.println("Total de numeros negativos:"+ neg);

	}
}
