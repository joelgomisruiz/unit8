/**
 * 
 */
package unit8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author joel
 *
 */
abstract class Persona {

	protected String dni;
	protected String nombre;
	protected ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
	/**
	 * 
	 */
	public Persona(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	public Persona(){
		
	}
	public void anyadirAsignatura(Asignatura a){
		asignaturas.add(a);
	}
	/**
	 * Metodo implementado en la clase hijo que devuelve true si es profesor o false si no lo es
	 * @return
	 */
	abstract boolean esProfesor();
	/**
	 * Metodo que muestra el nombre de la asignatura y la nota
	 */
	public void mostrarListadoAsignaturasNotas(){
		
		for (int i=0; i< asignaturas.size();i++){
			System.out.println("nombre: " + asignaturas.get(i).GetNombre() + " Nota: " + asignaturas.get(i).getNota());
		}
		
	}
	/**
	 * Metodo que devuelve el nombre
	 * @return
	 */
	public String getNombre(){
		return nombre;
	}
	/**
	 * Metodo que asigna el nombre
	 * @param nombre
	 */
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	/**
	 * Metodo que devuelve el nombre
	 * @return
	 */
	public String getDni(){
		return dni;
	}
	/**
	 * Metodo que asigna el dni
	 * @param dni
	 */
	public void setDni(String dni){
		this.dni = dni;
	}
	/**
	 * Metodo que devuelve el arraylist de asignaturas
	 * @return
	 */
	public ArrayList<Asignatura> getAsignaturas(){
		return asignaturas;
	}
	/**
	 * Metodo para ordenar el arraylist por asignaturas
	 */
	public void ordenarPorAsignatura(){
		Collections.sort(asignaturas, new Comparator<Asignatura>(){

			@Override
			public int compare(Asignatura o1, Asignatura o2) {
				return new String(o1.GetNombre()).compareTo(new String(o2.GetNombre()));
			}
		});	
	}
	/**
	 * Metodo que ordena el arraylist por las notas
	 */
	public void ordenarPorNota(){
		Collections.sort(asignaturas, new Comparator<Asignatura>(){

			@Override
			public int compare(Asignatura o1, Asignatura o2) {
				return new Double(o1.getNota()).compareTo(new Double(o2.getNota()));
			}
		});	
	}

}
