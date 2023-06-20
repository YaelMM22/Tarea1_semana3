package primer_Proyecto2023;

import java.util.Scanner;

public class Area_rectangulo {
	public static void main(String[] arg) {
		
		//multiplicamos el largo por el ancho.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el largo de su rectangulo ; ");
		float numero1 = input.nextFloat();
		
		System.out.println("Ingrese el ancho de su rectangulo ; ");
		float numero2 = input.nextFloat();
		
		double resultado = (numero1 * numero2);

		System.out.println("El resultado es: " + resultado);
		
		
	}

}