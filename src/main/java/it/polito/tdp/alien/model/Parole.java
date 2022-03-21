package it.polito.tdp.alien.model;

import java.util.HashSet;

import java.util.Set;


public class Parole {

	private String Parola = null;
	private Set<String> parole = new HashSet<String>();
	
	protected Parole(String parola) {
		super();
		this.Parola = parola;
	}


	public void addParola(String p) {
		this.parole.add(p);
	}
	
	
	public String getParola() {
		return Parola;
	}
	public Set<String> getParole() {
		return parole;
	}
	public void setParola(String parola) {
		this.Parola = parola;
	}
	public void setParole(Set<String> parole) {
		this.parole = parole;
		
		
		
		
		
		
		
	}
	
	
	
	
}
