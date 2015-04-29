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
	public double getNota(){
		return nota;
	}
	public void Setnota(double nota){
		this.nota = nota;
	}

}
