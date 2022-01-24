/**
 * 
 */
package EXAMEN;

/**
 * @author Miguel Manrique
 *
 */
public class Funciones {

	
	/**
	 * Función que recibe una matriz como parametro y la muestra por pantalla.
	 * @param matriz
	 */
	public static void mostrar_imcs(double matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("%.2f ,", matriz[i][j]);
			}
			System.out.println();
		}
	}
	
	
	/**
	 * Funcion que recibe una matriz y un numero de paciente que ira desde 0 hasta el numero de filas -1 de la matriz y devolvera
	 * la media de ese paciente
	 * @param matriz
	 * @param paciente
	 * @return si devuelve -1 significara que el paciente no existe.
	 */
	public static double media_paciente(double matriz[][], int paciente) {
		double media = -1;
		double suma = 0;
		if (paciente > matriz.length -1) {
			return media;
		}
		for (int i = paciente; i <= paciente; i++) {
			for (int  j= 0;  j< matriz[0].length ; j++) {
				System.out.println(matriz[i][j]);
				suma += matriz[i][j];
			}
		}
		media = suma/matriz[0].length;
		
		return media;
	}
}
