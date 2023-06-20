package primer_Proyecto2023;

import java.util.Scanner;

public class primeraPrueba {
	public static void main(String[] arg) {
		
		//Para convertir de ºF a ºC use la fórmula: ºC = (ºF-32) ÷ 1.8.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese la temperatura en grados °F; ");
		float numero1 = input.nextFloat();
		
		double resultado = (numero1 - 32)/1.8;

		
		System.out.println("El resultado es: " + resultado);
		
		
	}

}
