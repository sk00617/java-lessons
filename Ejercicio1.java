package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensaje="Tipos de mamíferos voladores según su vuelo";
		mensaje=mensaje.toLowerCase();
		mensaje=mensaje.replace(" ", "");
		int costo=0;
		for (char c:mensaje.toCharArray()) {
			if (c>=48 && c<=57)
				costo+=20;
			if (c>=97 && c<=122)
				costo+=10;
			else
				costo+=30;
		}
		System.out.println(costo);
	}

}

