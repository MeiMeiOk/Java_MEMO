package tarea1;

import java.util.Scanner;

public class tarea2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1, x2, x3, y1, y2, y3;
		double ab, bc, ca;
		
		Scanner captura = new Scanner(System.in);
		
		System.out.println("Ingrese la coordenadas del punto A");
		System.out.println("x1:");
		x1 = captura.nextDouble();
		System.out.println("y1:");
		y1 = captura.nextDouble();
		
		System.out.println("Ingrese la coordenadas del punto B");
		System.out.println("x2:");
		x2 = captura.nextDouble();
		System.out.println("y2:");
		y2 = captura.nextDouble();
		
		System.out.println("Ingrese la coordenadas del punto C");
		System.out.println("x3:");
		x3 = captura.nextDouble();
		System.out.println("y3:");
		y3 = captura.nextDouble();
		
		ab = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		bc = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		ca = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		
		if (ab == bc && ca == bc && ab == ca) {
			System.out.println("Tu tringulo con medidas: \nab= "+ ab + "\nbc= "+ bc + "\nca= " + ca);
			System.out.println("Es Equilatero");
		}
		if (ab == bc || bc == ca || ca == ab ) {
			System.out.println("Tu tringulo con medidas: \nab= "+ ab + "\nbc= "+ bc + "\nca= " + ca);
			System.out.println("Es Isoceles");
		}
		if (ab != bc && ab != ca && bc != ca) {
			System.out.println("Tu tringulo con medidas: \nab= "+ ab + "\nbc= "+ bc + "\nca= " + ca);
			System.out.println("Es Escaleno");
		}
		if(ab == 0 || bc == 0 || ca == 0) {
			System.out.println("Esto no es un triangulo");
		}

	}

}
