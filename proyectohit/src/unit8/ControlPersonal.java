/**
 * 
 */
package unit8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

/**
 * @author joel
 *
 */
public class ControlPersonal {

	private static ArrayList<Persona> personas = new ArrayList<Persona>();
	/**
	 * 
	 */
	private ControlPersonal() {
	}

	public static void anyadirPersona(Persona p){
		personas.add(p);
	}
	public void ordenarPorDni(){
		Collections.sort(personas, new Comparator<Persona>(){

			@Override
			public int compare(Persona o1, Persona o2) {
				return new String(o1.getDni()).compareTo(new String(o2.getDni()));
			}
		});	
	}
	public void ordenarPorOrdenAlfabetico(){
		Collections.sort(personas, new Comparator<Persona>(){

			@Override
			public int compare(Persona o1, Persona o2) {
				return new String(o1.getNombre()).compareTo(new String(o2.getNombre()));
			}
		});	
	}
	public void mostrarListado(){
	
		for (int i=0; i<personas.size();i++){
			System.out.println("Nombre: " + personas.get(i).getNombre() + " Dni: " + personas.get(i).getDni());
		}
	}

	
	public static void main(String[] args){
		
		ControlPersonal cp = new ControlPersonal();
		
		Asignatura a1 = new Asignatura("Programacion");
		Asignatura a2 = new Asignatura("Entornos");
		Asignatura a3 = new Asignatura("Sistemas");
		Asignatura a4 = new Asignatura("Lenguajes de marcas");
		Asignatura a5 = new Asignatura("Base de Datos");

		
		Alumno al1 = new Alumno("Joel", "111111111A");
		Alumno al2 = new Alumno("Gaspar", "222222222B");
		Alumno al3 = new Alumno("Angel", "333333333C");
		
		Profesor p1 = new Profesor("Rosa","123456789X");
		Profesor p2 = new Profesor("Nacho", "987654321W");
		Profesor p3 = new Profesor("Juan Carlos", "741258963Z");
		
		cp.anyadirPersona(al1);
		cp.anyadirPersona(al2);
		cp.anyadirPersona(al3);
		cp.anyadirPersona(p1);
		cp.anyadirPersona(p2);
		cp.anyadirPersona(p3);
		
		System.out.println("Listado de alumnos ordenados por nombre:");
		System.out.println();
		
		//ordenamos el arraylist por nombre y lo mostramos
		cp.ordenarPorOrdenAlfabetico();
		for(int i=0; i<personas.size(); i++){
			if(personas.get(i).esProfesor() == false){
				System.out.println("Nombre: " + personas.get(i).getNombre() + " Dni: " + personas.get(i).getDni());
			}
		}
		
		//añadimos las asignaturas a los alumnos
		for(int i=0; i<personas.size(); i++){
			if(personas.get(i).esProfesor() == false){
				personas.get(i).anyadirAsignatura(a1);
				personas.get(i).anyadirAsignatura(a2);
				personas.get(i).anyadirAsignatura(a3);
				personas.get(i).anyadirAsignatura(a4);
			}
		}
		//añadidos los profesores
		p1.anyadirAsignatura(a2);
		p2.anyadirAsignatura(a1);
		p3.anyadirAsignatura(a4);
		p3.anyadirAsignatura(a3);
		p1.anyadirAsignatura(a5);
		
		System.out.println();
		System.out.println("Listado de alumnos ordenados por nombre de asignatura:");
		System.out.println();
		
		//muestra el listado por de alumnos por asignatura
		for(int i=0;i<personas.size();i++){
			if(personas.get(i).esProfesor() == false){
				ArrayList<Asignatura> asig = personas.get(i).getAsignaturas();
				personas.get(i).ordenarPorAsignatura();
				System.out.println("Nombre: " + personas.get(i).getNombre());
				System.out.print("Asignaturas: ");
				for(int j=0; j< asig.size();j++){
					System.out.print(asig.get(j).GetNombre() + ", ");
				}
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("Listado de profesores ordenados por dni:");
		System.out.println();
		
		//muestra el listado de profesores ordenado por dni
		cp.ordenarPorDni();
		for(int i=0; i<personas.size();i++){
			if(personas.get(i).esProfesor() == true){
				System.out.println("Nombre: " + personas.get(i).getNombre() + " Dni: " + personas.get(i).getDni());
			}
		}
		Random r = new Random();
		//asignamos notas a los alumnos
		for(int i=0;i<personas.size();i++){
			if(personas.get(i).esProfesor() == false){
				ArrayList<Asignatura> asig = personas.get(i).getAsignaturas();
				for(int j=0; j< asig.size();j++){
					double aleatorio = r.nextDouble() * 11.0;
					asig.get(j).Setnota(aleatorio);
				}
			}
		}
		
		System.out.println();
		System.out.println("Listado de Alumnos por nota:");
		System.out.println();
		
		//mostramos el listado de alumnos ordenado por nota
		for(int i=0;i<personas.size();i++){
			if(personas.get(i).esProfesor() == false){
				ArrayList<Asignatura> asig = personas.get(i).getAsignaturas();
				personas.get(i).ordenarPorNota();
				System.out.println("Nombre: " + personas.get(i).getNombre());
				System.out.print("Asignaturas: ");
				for(int j=0; j< asig.size();j++){
					System.out.print(asig.get(j).GetNombre() + ": " + asig.get(j).getNota() + ", ");
				}
				System.out.println();
			}
		}
		
		//asignamos las notas de los profesores
		for(int i=0;i<personas.size();i++){
			if(personas.get(i).esProfesor() == true){
				ArrayList<Asignatura> asig = personas.get(i).getAsignaturas();
				for(int j=0; j< asig.size();j++){
					double aleatorio = r.nextDouble() * 11.0;
					asig.get(j).Setnota(aleatorio);
				}
			}
		}
		
		System.out.println();
		System.out.println("Listado de profesores por nota:");
		System.out.println();
		
		//mostramos el listado de profesores ordenado por nota
				
		for(int i=0;i<personas.size();i++){
			if(personas.get(i).esProfesor() == true){
				ArrayList<Asignatura> asig = personas.get(i).getAsignaturas();
				personas.get(i).ordenarPorNota();
				System.out.println("Nombre: " + personas.get(i).getNombre());
				for(int j=0; j< asig.size();j++){
					System.out.print(asig.get(j).getNota() + ", ");
				}
				System.out.println();
			}
		}
	}
	
}
