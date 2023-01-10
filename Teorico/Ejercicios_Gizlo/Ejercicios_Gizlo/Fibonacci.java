package Ejercicios_Gizlo;

public class Fibonacci {
	public static boolean pertenece(int num) {
		int i = 0, s=0;
		boolean b = false;
		do {
			s=serie(i);
			if(s==num) {
				b=true;
			}
			i++;
		}while(s<num);
		return b;
	}
	
	public static void sucesion(int h) {
		for(int i = 0; i < h; i++) {
			System.out.print(serie(i) + ", ");
		}
		System.out.println();
	}
	
	private static int serie(int v) {
		if(v == 0 || v== 1) {
			return v;
		}else {
			return serie(v-1)+serie(v-2);
		}
	}
}
