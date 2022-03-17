/**
 * 
 * Clase Cancion con varios atributos, constructores, metodos y getters
 * @author Andres
 * @version 16/02/2022
 *
 */
public class Cancion {
	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	// Definimos los constructores

	/**
	 * Constructor vacio (sin parametros) que por defecto da a la canci�n un titulo vacio, duraci�n 0 y sonando false
	 */
	Cancion() // Constructor sin par�metros
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}

	/**
	 * Constructor con dos parametros
	 * @param titulo - String Titulo de la canci�n
	 * @param duracion - int Duraci�n de la canci�n en segundos
	 */
	Cancion(String titulo, int duracion)// constructor con 2 par�metros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}

	/**
	 * Constructor con dos parametros
	 * @param titulo - String Titulo de la canci�n
	 * @param grupo - String Grupo autor de la canci�n
	 * @param duracion - int Duraci�n de la canci�n en segundos
	 * @param sonando - Boolean si esta sonando
	 */
	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 par�metros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}

	/**
	 * Metodo booleano para hacer que una canci�n se reproduzca
	 * Si la canci�n ya se esta reproduciendo devuelve un false ya que no hace nada.
	 * Si no esta sonando cambia el atributo sonando a true y devuelve true
	 * @return
	 */
	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}

	/**
	 * Metodo booleano para hacer que una canci�n se pare
	 * Si la canci�n ya esta parada devuelve un false ya que no hace nada.
	 * Si esta sonando cambia el atributo sonando a false y devuelve true
	 * @return
	 */
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}

	// meter m�todos get/set/toString()
	/**
	 * getter titulo
	 * @return - Devuelve titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Setter
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * Setter Grupo
	 * @return - Devuelve grupo
	 */
	public String getGrupo() {
		return grupo;
	}

	/**
	 * Setter Grupo
	 * @param grupo
	 */
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	/**
	 * Getter Duraci�n
	 * @return - Devuelve duraci�n
	 */
	public int getDuracion() {
		return duracion;
	}

	
	/**
	 * Setter Duraci�n
	 * @param duracion 
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	/**
	 * Getter Sonando
	 * @return - Devuelve sonando (true / false)
	 */
	public boolean isSonando() {
		return sonando;
	}

	/**
	 * Setter Sonando
	 * @param sonando 
	 */
	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}

	/**
	 * Metodo Booleano para comparar canciones
	 * Si el titulo de la cancion y el grupo son iguales devuelve true sino false
	 * @param cancion
	 * @return
	 */
	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}

	/**
	 * Metodo String para ordenar las canciones de Mayor duraci�n 
	 * y devolver la canci�n con mayor duraci�n
	 * @param canciones - Introduce el array con las canciones
	 * @return - Devuelve la canci�n con mayor duraci�n
	 */
	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}

	/**
	 * Metodo Estatico para indicar la siguiente cancion
	 * @param canciones - Introduce la canciones
	 * @param titulo - Introduce los titulos de las canciones
	 * @return - Devuelve la siguiente canci�n
	 */
	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}
	/**
	 * Metodo ToString para mostrar el titulo, autor,grupo,duracion y si esta sonando una canci�n
	 */
	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", autor=" + grupo + ", duracion=" + duracion + ", sonando=" + sonando
				+ "]";
	}
}