/**
 * 
 */
package unit8;

/**
 * @author joel
 *
 */
public class Asignatura {

	private String nombre;
	private double nota;
	/**
	 * 
	 */
	public Asignatura() {
		// TODO Auto-generated constructor stub
	}
	public Asignatura(String nombre){
		this.nombre = nombre;
	}
	public String GetNombre(){
		return nombre;
	}
	public void SetNombre(String nombre){
		this.nombre = nombre;
	}
	public String GetDni(){
		return dni;
	}
	public void SetDni(String dni){
		this.dni = dni;
	}

}
