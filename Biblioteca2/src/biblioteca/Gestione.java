package biblioteca;

import java.util.*;

import static utility.DataUtility.*;

public class Gestione {

	public Libro registraLibro(Biblioteca b, String titolo, String autore,
			String sn, int copie) {
		Libro l = b.getLibri().get(sn);
		if (l != null) {//se esiste aggiorno
			l.setCopieTotali(l.getCopieTotali() + copie);
			l.setCopieDisp(l.getCopieDisp() + copie);
		} else {//se non esiste creo e aggiungo
			l = new Libro(titolo, autore, sn);
			l.setCopieTotali(copie);
			l.setCopieDisp(copie);
			b.aggiungiLibro(l);
		}
		return l;
	}
	
	public Utente registraUtente(Biblioteca b, String nome, String cognome, String cf)
			throws UtenteGiaEsiste{
		if(b.getUtenti().containsKey(cf)){
			throw new UtenteGiaEsiste("L'utente è gia registrato!");
		}else{
			Utente u = new Utente(nome, cognome, cf);
			b.getUtenti().put(cf, u);
			return u;
		}	
	}
	
	public boolean prestaLibro(Biblioteca b, String serialNum, String cf){
		boolean token=false;
		
		Libro l=null;
		l= b.getLibri().get(serialNum);
		Utente u=null;
		u = b.getUtenti().get(cf);
		
		if(l!=null && u!=null 
				&& u.getNumeroLibri()<3 
				&& l.getCopieDisp()>0){
			
			Date today = new Date();
			Calendar cal = utilDateToCalendar(today);
			cal.add(Calendar.DATE, 14);
			Date dataScadenza = cal.getTime();
			
			
		}		
		
		return token;
	}
	
	
	
	public boolean restituisciLibro(Biblioteca b, String serialNum, String cf){
		boolean token=false;
		
		Libro l=null;
		l= b.getLibri().get(serialNum);
		Utente u=null;
		u = b.getUtenti().get(cf);
		
		if(l!=null && u!=null && b.getPrestiti().containsKey(cf+" "+serialNum)){
			for(Map.Entry<String, Prestito> p : b.getPrestiti().entrySet()){
				if(p.getValue().getL().equals(l)
						&& p.getValue().getU().equals(u)
						&& p.getValue().getRestituzione()==null){
					Date today = new Date();
					Prestito P = b.getPrestiti().get(cf+" "+serialNum);
					P.setRestituzione(today);
					token = true;
					break;
				}
			}
		}		
		return token;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}