package EXAMEN;

import java.util.Iterator;
import java.util.Scanner;

public class Ej2_manriquearooyo_miguel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double imcs_pacientes [][] = {

			    {15.7,15.8,16.1,16.3,16.7,17,17.4,17.1,17.5,17.6,18.4,18.6},

			    {38.5,38.4,38.3,38.3,38.8,37.5,37.4,37.1,36.8,36.0,35.4,35.2},

			    {33.5,33.6,33.8,33.9,33.6,33.1,32.4,31.8,31.7,29.8,28.4,27.2},

			    {32.7,32.4,33,32.7,32.9,31.6,31.5,30.4,29.2,27.3,25.2,24.7}

			};
		
		Funciones.mostrar_imcs(imcs_pacientes);
		System.out.println();
		System.out.println("Dime el numero del paciente cuya media quieres calcular: ");
		int paciente = sc.nextInt();
		double media = Funciones.media_paciente(imcs_pacientes, paciente);
		
		if (media == -1) {
			System.out.println("El paciente seleccionado no existe");
		}
		if (media != -1) {
			System.out.printf("La media del paciente es %.2f", media);
		}
		sc.close();
	}

}
