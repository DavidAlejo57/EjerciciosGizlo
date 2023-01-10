package Ejercicios_Gizlo;

public class Primo {
	public static Boolean comprobar(int p){
		if(p == 0 || p == 1 || p == 4) {
			return false;
		}
		for(int i=2; i < p/2; i++) {
			if(p % i == 0)
				return false;
		}
		
		return true;
	}
}
