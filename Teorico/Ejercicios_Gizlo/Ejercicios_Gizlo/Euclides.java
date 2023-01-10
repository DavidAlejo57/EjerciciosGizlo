package Ejercicios_Gizlo;


public class Euclides {
	public static String Dividir(int a, int b) {

	    int temporal=0, resto;
	    if(a<b){
	        temporal=a;
	        a=b;
	        b=temporal;
	    }
	    while(b!=0){
	        resto=a%b;
	        System.out.println("Division "+ a/b );
	        System.out.println("Resto " + resto );
	        a=b;
	        b=resto;
	    }
	    return("Resultado final= "+a);
	}
	
}
