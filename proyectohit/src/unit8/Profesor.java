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
	boolean esProfesor() {
		return true;
	}

}
