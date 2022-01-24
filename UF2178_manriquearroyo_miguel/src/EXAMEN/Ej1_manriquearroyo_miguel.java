package EXAMEN;

import java.util.Scanner;

public class Ej1_manriquearroyo_miguel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float peso, altura, imc;
		String cadena = "";
		System.out.println("Dime el peso del paciente: ");
		Scanner sc = new Scanner(System.in);
		peso = sc.nextFloat();
		System.out.println("Dime la altura del paciente: ");
		altura = sc.nextFloat();
		
		//imc = peso/altura^2
		
		altura = altura * altura;
		
		imc = peso/altura;

		if (imc < 18.5) {
			cadena ="Bajo peso.";
		}else if ((imc>= 18.5) && (imc<= 24.9)) {
			cadena = "Peso normal (Saludable).";
		}else if ((imc>= 25) && (imc<= 29.9)) {
			cadena = "Sobrepeso.";
		}else if ((imc>= 30) && (imc<= 40)) {
			cadena = "Obesidad premórbida.";
		}else if (imc>40) {
			cadena = "Obesidad mórbida.";
		}
		System.out.printf("El paciente de %.2f kg y %.2f m de altura tiene un IMC de %.2f y tiene un diagnostico de %s",peso,altura,imc,cadena);
		sc.close();
	}

}
