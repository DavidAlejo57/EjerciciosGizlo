package Ejercicios_Gizlo;

public class Binario {
	public static String decimalAbinario(int d) {
		String bi = "";
		while(d > 0) {
			bi = d % 2 + bi;
			d = d/2;
		}
		return bi;
	}
}
