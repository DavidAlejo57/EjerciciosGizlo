package Ejercicios_Gizlo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a,b,n,v,de;
		Scanner s = new Scanner(System.in);
		Euclides E = new Euclides();
		System.out.print("Ingrese el numero a dividir: ");
		a=s.nextInt();
		System.out.print("Ingrese el numero a divisor: ");
		b=s.nextInt();
		System.out.println(E.Dividir(a,b));
		
		Generar_clave g = new Generar_clave();
        System.out.println("La clave generada es: " + g.generar(8));
        
        Primo p = new Primo();
        System.out.print("Ingrese el numero a comprobar si es primo: ");
		n=s.nextInt();
        if(p.comprobar(n)) {
        	System.out.println("El numero " + n + " si es primo");
        }else {
        	System.out.println("El numero " + n + " no es primo");
        }
        
        Fibonacci f = new Fibonacci();
        System.out.print("Ingrese el numero a comprobar si pertenece a fibonacci: ");
		v=s.nextInt();
        if(f.pertenece(v)) {
        	System.out.println("El numero " + v + " si pertenece a la serie");
        }else {
        	System.out.println("El numero " + v + " no pertenece a la serie");
        }
        
        Binario bi = new Binario();
        System.out.print("Ingrese el numero a convertir a binario: ");
		de=s.nextInt();
		System.out.println("El binario resultante es: "+bi.decimalAbinario(de));
	}

}
