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
	protected ArrayList<Asignatura> asignaturas;
	/**
	 * 
	 */
	public Persona(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		asignaturas = new ArrayList<Asignatura>();
	}
	public Persona(){
		
	}
	public void anyadirAsignatura(Asignatura a){
		asignaturas.add(a);
	}
	
	abstract boolean esProfesor();
	
	public void mostrarListadoAsignaturasNotas(){
		System.out.println("nombre: " + getNombre() + asignaturas.get(0).GetNombre() + asignaturas.get(0).getNota());
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getDni(){
		return dni;
	}
	public void setDni(String dni){
		this.dni = dni;
	}
	public ArrayList<Asignatura> getAsignaturas(){
		return asignaturas;
	}
	
	public void ordenarPorAsignatura(){
		Collections.sort(asignaturas, new Comparator<Asignatura>(){

			@Override
			public int compare(Asignatura o1, Asignatura o2) {
				return new String(o1.GetNombre()).compareTo(new String(o2.GetNombre()));
			}
		});	
	}
	
	public void ordenarPorNota(){
		Collections.sort(asignaturas, new Comparator<Asignatura>(){

			@Override
			public int compare(Asignatura o1, Asignatura o2) {
				return new Double(o1.getNota()).compareTo(new Double(o2.getNota()));
			}
		});	
	}

}
