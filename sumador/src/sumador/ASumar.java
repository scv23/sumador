package sumador;

public class ASumar {

	public String sumativo(String cad) {
		// TODO Apéndice de método generado automáticamente
		String numero = cad;
		String cadena = "";
		
		char primero = numero.charAt(0);
		
		if (primero == '-') {
			cadena = "Negativo. Siempre negativo";
		} else {
			cadena = numero+ " = " +numero;
		}
		return cadena;
	}
	
	public int total(int numero) {
		int resultado = 0;
		while (numero>0) {
			resultado += numero % 10;
			numero = numero / 10;
		}
		return resultado;
	}

}
