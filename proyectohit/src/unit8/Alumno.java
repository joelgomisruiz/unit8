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
	public boolean esProfesor(){
		return false;
	}

}
