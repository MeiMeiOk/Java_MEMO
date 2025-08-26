package clase_1;

import java.util.Scanner;

public class memo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, edad, caso = 12; //Variables Enteras
		char sexo = 't';
		boolean flag = true; //true or false 
		double precio = 1.99;
		float altura = 1.65f;
		String nombre = "Guillermo";
	
		int result;
		
		System.out.println("Hola " + nombre);
		
		Scanner captura = new Scanner(System.in);
		
		boolean p = false;
		
		
		while (p == false) {
			
			System.out.println("Selecciona una opciòn del menu");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. multiplicacion");
			System.out.println("4. Salir");
			System.out.print("Opcion: ");
			int opc = captura.nextInt();
			switch(opc) {
				case 1:
					System.out.println("Valor1: ");
					int val_1 = captura.nextInt();
					
					System.out.println("Valor2: ");
					int val_2 = captura.nextInt();
					
					result = val_1 + val_2;
					
					System.out.println("El resultado de tu SUMA es: " + result);
					
					break;
					
				case 2: 
					System.out.println("Valor1: ");
					val_1 = captura.nextInt();
					
					System.out.println("Valor2: ");
					val_2 = captura.nextInt();
					
					result = val_1 - val_2;
					
					System.out.println("El resultado de tu RESTA es: " + result);
					
					break;
				case 3: 
					System.out.println("Valor1: ");
					val_1 = captura.nextInt();
					
					System.out.println("Valor2: ");
					val_2 = captura.nextInt();
					
					result = val_1 * val_2;
					
					System.out.println("El resultado de tu MULTIPLICACIÓN es: " + result);
					
					break;
					
				case 4:
					p=true;
					break;
					
				default: 
					System.out.println("ESA MAMADA QUEEEEE");
					break;
				
				
			
		}
		}
	}

}
