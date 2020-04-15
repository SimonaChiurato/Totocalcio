package it.polito.tdp.totocalcio.model;

import java.util.List;

public class TestRicerca {

	public static void main(String[] args) {
		
		Pronostico pro= new Pronostico();
		pro.add(new PronosticoPartita("2x"));
		pro.add(new PronosticoPartita("1"));
		pro.add(new PronosticoPartita("2x1"));
		pro.add(new PronosticoPartita("21"));
		
		Ricerca r= new Ricerca();
		
		List<Risultato> risultati= r.cerca(pro);
		for(Risultato rr:risultati) {
		System.out.println(rr);
		}
	}

}
