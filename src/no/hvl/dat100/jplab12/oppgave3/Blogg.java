package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	private Innlegg[] nyBlogg;
	private int nesteLedig = 0;

	public Blogg() {
		nyBlogg = new Innlegg[20];
		this.nesteLedig = 0;
	}

	public Blogg(int lengde) {
		nyBlogg = new Innlegg[lengde];
		this.nesteLedig = 0;
	}

	public int getAntall() {
		return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return nyBlogg;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteLedig; i++) {
				if (innlegg.erLik(nyBlogg[i])) {
					return i;
				}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean funnet = false;
		int i = 0;
		while (i < nesteLedig && !funnet) {
				if (innlegg.getId() == nyBlogg[i].getId()) {
						funnet = true;
				}
				i++;
		}
		return funnet;
	}

	public boolean ledigPlass() {
		boolean ledig = true;
			if (nesteLedig == nyBlogg.length) {
					ledig = false;
			}
			return ledig;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean lagtTil = false;
		if (!finnes(innlegg)) {
			nyBlogg[nesteLedig] = innlegg;
			lagtTil = true;
			nesteLedig++;
		}
		return lagtTil;
		
	}
	
	public String toString() {
		String a = "";
		for (int i = 0; i < nesteLedig; i++) {
				a += nyBlogg[i].toString();
		}
		return nesteLedig + "\n" + a;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}