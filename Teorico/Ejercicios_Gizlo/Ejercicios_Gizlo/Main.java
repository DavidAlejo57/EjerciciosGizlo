package Ejercicios_Gizlo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a,b,n,v,de,l;
		Scanner s = new Scanner(System.in);

		//Ejercicio de divicion de eucladies
		System.out.print("Ingrese el numero a dividir: ");
		a=s.nextInt();
		System.out.print("Ingrese el numero a divisor: ");
		b=s.nextInt();
		System.out.println(Euclides.Dividir(a,b));
		
		//Ejercicio de generacion de claves
        System.out.println("La clave generada es: " + Generar_clave.generar(8));
        
        //Ejercicio de comprobar si un numero es primo
        System.out.print("Ingrese el numero a comprobar si es primo: ");
		n=s.nextInt();
        if(Primo.comprobar(n)) {
        	System.out.println("El numero " + n + " si es primo");
        }else {
        	System.out.println("El numero " + n + " no es primo");
        }
        
        //Ejercicio para comprobar si un numero pertenece a la sucesion de fibonacci
        System.out.print("Ingrese el numero a comprobar si pertenece a fibonacci: ");
		v=s.nextInt();
        if(Fibonacci.pertenece(v)) {
        	System.out.println("El numero " + v + " si pertenece a la serie");
        }else {
        	System.out.println("El numero " + v + " no pertenece a la serie");
        }
        
        //Ejercicio para convertir numeros enteros decimales a binarios
        System.out.print("Ingrese el numero a convertir a binario: ");
		de=s.nextInt();
		System.out.println("El binario resultante es: "+Binario.decimalAbinario(de));
		
		//Ejercicio para obtener la cantidad de valores de la sucesion de fibonacci ingresada por teclado
		System.out.print("Ingrese el numero de elementos de la sucesion de fibonacci: ");
		v=s.nextInt();
		Fibonacci.sucesion(v);
		
		//Ejercicio para convertir un numero a letras
		System.out.print("Ingrese el numero a convertir a letras: ");
		l=s.nextInt();
		String letras = NumerosALetras.Convertir(String.valueOf(l), true);
		System.out.println(letras);
		s.close();
	}

}
