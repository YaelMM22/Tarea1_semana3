package primer_Proyecto2023;

import java.util.Scanner;

public class Area_circulo {
	public static void main(String[] arg) {
		
		//Área = pi por radio al cuadrado.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el radio de su circulo ; ");
		float numero1 = input.nextFloat();

		double resultado = (3.14159265359 * (numero1 * numero1));

		System.out.println("El resultado es: " + resultado);
		
		
	}

}