/**
 * Paquete que pertenece al modelo el cual se encarga de la representacion de objetos 
 */
package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Clase Ordenamiento del proyecto.
 *
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolás
 */
public class Ordenamiento {

	/**
	 * Metodo estatico con el ordenamiento burbuja para organizar los ingresos de
	 * forma descendente
	 * 
	 * @param arreglo ArrayList con usuarios
	 */
	
	public static void burbujaDineroDescendente(ArrayList<PersonaDTO> arreglo) {
		for (int i = 0; i < arreglo.size(); i++) {
			PersonaDTO temporal;
			for (int j = i + 1; j < arreglo.size(); j++) {
				if (arreglo.get(i).getIngresos() < arreglo.get(j).getIngresos()) {
					temporal = arreglo.get(j);
					arreglo.set(j, arreglo.get(i));
					arreglo.set(i, temporal);
				}
			}
		}
	}

	/**
	 * Metodo estatico con el ordenamiento burbuja para organizar los ingresos de
	 * forma ascendente
	 * 
	 * @param arreglo ArrayList con usuarios
	 */

	public static void burbujaDineroAscendente(ArrayList<PersonaDTO> arreglo) {
		for (int i = 0; i < arreglo.size(); i++) {
			PersonaDTO temporal;
			for (int j = i + 1; j < arreglo.size(); j++) {
				if (arreglo.get(i).getIngresos() > arreglo.get(j).getIngresos()) {
					temporal = arreglo.get(j);
					arreglo.set(j, arreglo.get(i));
					arreglo.set(i, temporal);
				}
			}
		}
	}

	/**
	 * Metodo estatico con el ordenamiento burbuja para organizar los likes de forma
	 * descendente
	 * 
	 * @param arreglo ArrayList con usuarios
	 */

	public static void burbujaNumeroLikesDescendente(ArrayList<PersonaDTO> arreglo) {
		for (int i = 0; i < arreglo.size(); i++) {
			PersonaDTO temporal;
			for (int j = i + 1; j < arreglo.size(); j++) {
				if (arreglo.get(i).getNumeroLikesRecibidos() < arreglo.get(j).getNumeroLikesRecibidos()) {
					temporal = arreglo.get(j);
					arreglo.set(j, arreglo.get(i));
					arreglo.set(i, temporal);
				}
			}
		}
	}

	/**
	 * Metodo estatico con el ordenamiento burbuja para organizar los likes de forma
	 * ascendente
	 * 
	 * @param arreglo ArrayList con usuarios
	 */
	public static void burbujaNumeroLikesAscendente(ArrayList<PersonaDTO> arreglo) {
		for (int i = 0; i < arreglo.size(); i++) {
			PersonaDTO temporal;
			for (int j = i + 1; j < arreglo.size(); j++) {
				if (arreglo.get(i).getNumeroLikesRecibidos() > arreglo.get(j).getNumeroLikesRecibidos()) {
					temporal = arreglo.get(j);
					arreglo.set(j, arreglo.get(i));
					arreglo.set(i, temporal);
				}
			}
		}
	}

	/**
	 * Metodo estatico con el ordenamiento burbuja para organizar la edads de forma
	 * descendente
	 * 
	 * @param arreglo ArrayList con usuarios
	 */

	public static void burbujaEdadDescendente(ArrayList<PersonaDTO> arreglo) {
		for (int i = 0; i < arreglo.size(); i++) {
			PersonaDTO temporal;
			for (int j = i + 1; j < arreglo.size(); j++) {
				if (arreglo.get(i).getEdad() < arreglo.get(j).getEdad()) {
					temporal = arreglo.get(j);
					arreglo.set(j, arreglo.get(i));
					arreglo.set(i, temporal);
				}
			}
		}
	}

	/**
	 * Metodo estatico con el ordenamiento burbuja para organizar la edad de forma
	 * ascendente
	 * 
	 * @param arreglo ArrayList con usuarios
	 */

	public static void burbujaEdadAscendente(ArrayList<PersonaDTO> arreglo) {
		for (int i = 0; i < arreglo.size(); i++) {
			PersonaDTO temporal;
			for (int j = i + 1; j < arreglo.size(); j++) {
				if (arreglo.get(i).getEdad() > arreglo.get(j).getEdad()) {
					temporal = arreglo.get(j);
					arreglo.set(j, arreglo.get(i));
					arreglo.set(i, temporal);
				}
			}
		}
	}

	/**
	 * Metodo con el ordenamiento CollectionsSort para organizar el nombre de forma
	 * ascendente
	 * 
	 * @param arreglo ArrayList con usuarios
	 */
	public void ordenamientoNombreAscendente(ArrayList<PersonaDTO> arreglo) {
		Collections.sort(arreglo, new Comparator<PersonaDTO>() {
			public int compare(PersonaDTO obj1, PersonaDTO obj2) {
				return obj1.getNombre().compareTo(obj2.getNombre());
			}
		});
//		for(PersonaDTO temp: arreglo){
//			System.out.println(temp.getNombre());
//		}
	}

	/**
	 * Metodo con el ordenamiento CollectionsSort para organizar el nombre de forma
	 * descendente
	 * 
	 * @param arreglo ArrayList con usuarios
	 */
	public void ordenamientoNombreDescendente(ArrayList<PersonaDTO> arreglo) {
		Collections.sort(arreglo, new Comparator<PersonaDTO>() {
			public int compare(PersonaDTO obj1, PersonaDTO obj2) {
				return obj2.getNombre().compareTo(obj1.getNombre());
			}
		});

	}

	/**
	 * Metodo con el ordenamiento CollectionsSort para organizar el Apellido de
	 * forma ascendente
	 * 
	 * @param arreglo ArrayList con usuarios
	 */
	public void ordenamientoApellidoAscendente(ArrayList<PersonaDTO> arreglo) {
		Collections.sort(arreglo, new Comparator<PersonaDTO>() {
			public int compare(PersonaDTO obj1, PersonaDTO obj2) {
				return obj1.getApellido1().compareTo(obj2.getApellido1());
			}
		});

	}

	/**
	 * Metodo con el ordenamiento CollectionsSort para organizar el apellido de
	 * forma descendente
	 * 
	 * @param arreglo ArrayList con usuarios
	 */
	public void ordenamientoApellidoDescendente(ArrayList<PersonaDTO> arreglo) {
		Collections.sort(arreglo, new Comparator<PersonaDTO>() {
			public int compare(PersonaDTO obj1, PersonaDTO obj2) {
				return obj2.getApellido1().compareTo(obj1.getApellido1());
			}
		});

	}

	/**
	 * Metodo con el ordenamiento CollectionsSort para organizar el alias de forma
	 * ascendente
	 * 
	 * @param arreglo ArrayList con usuarios
	 */
	public void ordenamientoAliasAscendente(ArrayList<PersonaDTO> arreglo) {
		Collections.sort(arreglo, new Comparator<PersonaDTO>() {
			public int compare(PersonaDTO obj1, PersonaDTO obj2) {
				return obj1.getUsuario().compareTo(obj2.getUsuario());
			}
		});

	}

	/**
	 * Metodo con el ordenamiento CollectionsSort para organizar el alias de forma
	 * descendente
	 * 
	 * @param arreglo ArrayList con usuarios
	 */
	public void ordenamientoAliasDescendente(ArrayList<PersonaDTO> arreglo) {
		Collections.sort(arreglo, new Comparator<PersonaDTO>() {
			public int compare(PersonaDTO obj1, PersonaDTO obj2) {
				return obj2.getUsuario().compareTo(obj1.getUsuario());
			}
		});

	}

	/**
	 * Metodo con el ordenamiento CollectionsSort para organizar el genero de forma
	 * ascendente
	 * 
	 * @param arreglo ArrayList con usuarios
	 */
	public void ordenamientoGeneroAscendente(ArrayList<PersonaDTO> arreglo) {
		Collections.sort(arreglo, new Comparator<PersonaDTO>() {
			public int compare(PersonaDTO obj1, PersonaDTO obj2) {
				return obj1.getSexo().compareTo(obj2.getSexo());
			}
		});

	}

	/**
	 * Metodo con el ordenamiento CollectionsSort para organizar el genero de forma
	 * descendente
	 * 
	 * @param arreglo ArrayList con usuarios
	 */
	public void ordenamientoGeneroDescendente(ArrayList<PersonaDTO> arreglo) {
		Collections.sort(arreglo, new Comparator<PersonaDTO>() {
			public int compare(PersonaDTO obj1, PersonaDTO obj2) {
				return obj2.getSexo().compareTo(obj1.getSexo());
			}
		});

	}

}
