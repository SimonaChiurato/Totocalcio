package it.polito.tdp.totocalcio.model;

import java.util.ArrayList;
import java.util.List;

public class Ricerca {

	private Pronostico pronostico;
	private int N;
	List<Risultato> soluzione;
	public List<Risultato> cerca(Pronostico pro) {
		this.pronostico=pro;
		this.N=pronostico.size();
		this.soluzione= new ArrayList<>();
		List<RisultatoPartita> parziale= new ArrayList<>();
		int livello=0;
		this.ricorsiva(parziale, livello);
		return this.soluzione ;
	}
	
	private void ricorsiva( List<RisultatoPartita> parziale,int livello) {
		
		if(livello==N) {
			
			soluzione.add(new Risultato(parziale));
			
		}else {
			PronosticoPartita pp = pronostico.get(livello);
			for(RisultatoPartita ris: pp.getRisultati()) {
				parziale.add(ris);
				this.ricorsiva(parziale,livello+1);
				parziale.remove(parziale.size()-1);
			}
		}
	}

}
