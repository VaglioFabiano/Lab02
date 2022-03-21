package it.polito.tdp.alien.model;

import java.util.Map;
import java.util.TreeMap;

public class model {
	private Map <String, Parole> paroleTradotte = new TreeMap<String, Parole>();

	public void aggiungiDizionario(String Aliena, String Italiana) {
		if(paroleTradotte.containsKey(Aliena) == false) {
			Parole p = new Parole(Aliena);
			p.addParola(Italiana);
			paroleTradotte.put(Aliena, p);
			return;
		}else {
			paroleTradotte.get(Aliena).addParola(Italiana);
			return;
		}
		
	}
	public String traduzione(String Aliena) {
		if(Aliena.contains("?")) {
			String i = Aliena.replace("?", ".");
			String ii="";
			for (Parole r: paroleTradotte.values()) {
				if(r.getParola().matches(i)) {
					for(String m : r.getParole()) {
						ii += m + "\n";
					}
				}
			}
			return ii;
		}
		if (paroleTradotte.containsKey(Aliena) == false) {
			return "Parola ancora non inserita nel dizionario";
		}

		String ii = "";
		for (String r : paroleTradotte.get(Aliena).getParole()) {
			ii += r + "\n";
		}
		return ii;
	}
}
