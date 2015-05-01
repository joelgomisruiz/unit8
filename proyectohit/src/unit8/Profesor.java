/**
 * 
 */
package unit8;

/**
 * @author joel
 *
 */
public class Profesor extends Persona {

	/**
	 * 
	 */
	public Profesor() {
	}
	public Profesor(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	/**
	 * Metodo de la clase persona que devuelve true al ser profesor
	 */
	boolean esProfesor() {
		return true;
	}

}
