package arreglos;

import java.util.Scanner;

public class estandares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=0;
		int i=1;
		int[] edades= new int[4];
		
		Scanner captura = new Scanner(System.in);
		
		for(i=1; i < edades.length; i++) {
			System.out.println("Introduce la edad del niño "+ i + ": ");
			edades[i]= captura.nextInt();
			
		}
		i=0;
		for(i=1; i >= edades.length; i++) {
			System.out.println("la edad del niño"+ i + "es: " + edades[i]);
		}

	}

}
