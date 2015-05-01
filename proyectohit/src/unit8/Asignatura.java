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
	/**
	 * Metodo que devuelve el nombre de la asignatura
	 * @return
	 */
	public String GetNombre(){
		return nombre;
	}
	/**
	 * Metodo que asigna el nombre a la asignatura
	 * @param nombre
	 */
	public void SetNombre(String nombre){
		this.nombre = nombre;
	}
	/**
	 * Metodo que devuelve la nota
	 * @return
	 */
	public double getNota(){
		return nota;
	}
	/**
	 * Metodo que asigna la nota
	 * @param nota
	 */
	public void Setnota(double nota){
		this.nota = nota;
	}

}
