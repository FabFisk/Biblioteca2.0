package biblioteca;

import java.util.*;

import utility.*;

public class Biblioteca implements Validate {
	
	private String nome;
	private Map<String, Libro> libri = new HashMap<String, Libro>();
	private Map<String, Utente> utenti = new HashMap<String, Utente>();
	

	public Biblioteca (){}
	public Biblioteca(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Map<String, Libro> getLibri() {
		return libri;
	}
	public void setLibri(Map<String, Libro> libri) {
		this.libri = libri;
	}
	public Map<String, Utente> getUtenti() {
		return utenti;
	}
	public void setUtenti(Map<String, Utente> utenti) {
		this.utenti = utenti;
	}
	
	
	
	
	
	public void aggiungiUtente(Utente u){
		this.utenti.put(u.getCf(), u);
	}
	
	public void aggiungiLibro(Libro l){
		libri.put(l.getSerialNum(), l);
	}

	@Override
	public boolean isValid() {
		boolean token = false;
		if((!this.nome.isEmpty()&& this.nome!=null)){
			token = true;
		}
		return token;
	}
}
