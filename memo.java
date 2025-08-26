package tarea1;

import java.util.Scanner;

public class memo {

	public static void main(String[] args) {
		int[] num = new int[16];
		int fin = 0, y = 0, neg = 0, prom = 0;
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
		
		for(int i=0; i<num.length; i++) {
			if(num[i] != 0) {
				prom += num[i];
				y++;
			}
		}
		
		if(fin == 0) {
			System.out.println("No hay numeros impares");
		}
		else {
			fin = prom / y;
			System.out.println(" ");
			System.out.println("Promedio de numeros impares: " + fin);
		}

	}
}
