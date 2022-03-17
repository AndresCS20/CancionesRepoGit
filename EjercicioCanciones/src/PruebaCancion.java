/**
 * Clase Pruebacancion que incluye el main 
 * @author Andres
 * @version 16/02/2022
 * @see Cancion
 *
 */
public class PruebaCancion {
	/**
	 * Metodo MAIN en el que se inicializa el objeto cancion, 
	 * se crea el array de canciones y se les da valor a cada cancion
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cancion cancionPrueba = new Cancion();
		System.out.println(cancionPrueba);
		
		Cancion cancionClasico = new Cancion("Sweet Home Alabama", 180);
		System.out.println(cancionPrueba);
		
		Cancion primeraCancion = new Cancion("I Don't Like Mondays", "The Boomtown Rats", 390, true);
		Cancion segundaCancion = new Cancion("Don’t Stop Believin’", "Journey", 320, false);
		Cancion terceraCancion = new Cancion("Come Join The Murder", "The White Buffalo & The Forest Rangers", 420, false);
		Cancion cuartaCancion = new Cancion("Sweet Child O' Mine", "Guns N' Roses", 312, false);
		Cancion quintaCancion = new Cancion("A Kind of Magic", "Queen", 284, false);

		if (primeraCancion.reproducirCancion()) {
			System.out.println(primeraCancion.getTitulo() + "está sonando");
		}
		if (primeraCancion.pararCancion()) {
			System.out.println(primeraCancion.getTitulo() + "stop");
		}
		if (primeraCancion.MismaCancion(cancionClasico)) {
			System.out.println("Parece que no son la misma canción");
		}
		Cancion nueva = new Cancion("Baba O'riley", "The Who", 310, false);
		Cancion[] canciones = { primeraCancion, segundaCancion, terceraCancion, nueva };
		
		mostrarCancionesyAutor(canciones);
		mostrarCancionMasLarga(canciones);

		mostrarSiguienteCancion(primeraCancion, canciones);
		mostrarSiguienteCancion(nueva, canciones);
	}

	
	/**
	 * Metodo para mostrar la siguiente canción
	 * @param miCancion Introduce una canción
	 * @param canciones Introduce array de canciones
	 */
	private static void mostrarSiguienteCancion(Cancion miCancion, Cancion[] canciones) {
		System.out.println("La canción que sonará después de " + miCancion.getTitulo() + " será "
				+ Cancion.SiguienteCancion(canciones, miCancion.getTitulo()));
	}

	/**
	 * Metodo para mostrar la Canción más larga
	 * @param canciones Introduce array de canciones
	 */
	private static void mostrarCancionMasLarga(Cancion[] canciones) {
		System.out.println("La canción más larga es: " + Cancion.MayorDuracion(canciones));
	}

	/**
	 * Mostrar Canciones y el Autor (Autor).
	 * Recorre el array de canciones y te muestra el titulo y el grupo de la cancion
	 * @param canciones Introduce Array de canciones
	 */
	private static void mostrarCancionesyAutor(Cancion[] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			System.out.println("La canción es " + canciones[i].getTitulo() + " de " + canciones[i].getGrupo());
		}
	}
	

}