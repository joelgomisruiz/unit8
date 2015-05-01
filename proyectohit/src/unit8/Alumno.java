/**
 * 
 */
package unit8;

/**
 * @author joel
 *
 */
public class Alumno extends Persona {

	/**
	 * 
	 */
	public Alumno(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	public Alumno(){
		
	}
	/**
	 * Metodo de la clase persona que devuelve false al ser alumno
	 */
	public boolean esProfesor(){
		return false;
	}

}
