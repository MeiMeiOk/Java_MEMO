package arreglos;

import java.util.Scanner;

public class cadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nombres; //Declaración de un arreglo
		String[] estados = new String[15];
		double[] precios = new double[5];
		long[]tels;
		
		estados[0]= "Jalisco";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos elementos quieres almacenar: ");
		int elementos = sc.nextInt();
		
		nombres = new String[elementos];
		for(int i =0; i < nombres.length; i++) {
			System.out.println("Nombre: " + i);
			nombres[i] = sc.nextLine();
		}
		
		for(String nombre : nombres) {
			System.out.println(nombre);
		}
		

	}

}
