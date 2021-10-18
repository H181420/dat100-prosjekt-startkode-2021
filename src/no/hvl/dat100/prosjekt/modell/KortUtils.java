package no.hvl.dat100.prosjekt.modell;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling samling av kort som skal sorteres.
	 */

	public static void sorter(KortSamling samling) {

		// TODO - START

		Kort[] ny = samling.getSamling();
		for (int i = 0; i < ny.length; i++) {
			int minste = i;
			for (int j=i+1; j<ny.length; j++) {
				if (ny[j].compareTo(ny[minste])< 0) {
					minste = j; 
				}
			}
			Kort k = ny[i];
			ny[i] = ny[minste];
			ny[minste] = k;
				
		}
		samling.fjernAlle();
		for (int i = 0; i < ny.length; i++) {
			samling.leggTil(ny[i]);
			
		}
		// throw new UnsupportedOperationException(TODO.method());
		// TODO - END
	}

	/**
	 * Stokkar en kortsamling.
	 * 
	 * @param samling samling av kort som skal stokkes.
	 */
	public static void stokk(KortSamling samling) {

		// TODO - START

		throw new UnsupportedOperationException(TODO.method());
		// TODO - END
	}

}
