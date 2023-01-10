package Ejercicios_Gizlo;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Generar_clave {
	public static String generar(int len) {
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789._@#$*-";
		
		SecureRandom random = new SecureRandom();
		
		return IntStream.range(0, len)
				.map(i -> random.nextInt(chars.length()))
				.mapToObj(randomIndex -> String.valueOf(chars.charAt(randomIndex)))
				.collect(Collectors.joining());
	}
}
