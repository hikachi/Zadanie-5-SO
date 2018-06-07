import java.util.*;
public class StrategiaNr1 {

	private int czas=0;
	private int sumaobciazen=0;
	private int prog;
	private ArrayList<Proces>[]tab;
	private ArrayList<Proces>listazadan=new ArrayList();
	public StrategiaNr1(ArrayList<Proces> list,int iloscprocesorow,int prog) {
		for(Proces x:list) {
			Proces p=new Proces(x);
			listazadan.add(p);
		}
		tab=new ArrayList[iloscprocesorow];
		}
	
	
	public void run() {
		Proces pr;
		boolean koniec=false;
		while(listazadan.size()!=0||koniec==true) {
			//dodaj na procesor
			pr=listazadan.get(0);
			wstaw(pr);
			//czas -1
			for(int tablice=0;tablice<tab.length;tablice++) {
				for(int index=0;index<tab[tablice].size();index++) {
					tab[tablice].get(index).czas();
				}
			}
			// zliczanie obciazenia
			for(int tablice=0;tablice<tab.length;tablice++) {
				sumaobciazen+=tab[tablice].size();
			}
			czas++;
			//usuwanie zakonczonych
			for(int tablice=0;tablice<tab.length;tablice++) {
				for(int index=0;index<tab[tablice].size();index++) {
					if(tab[tablice].get(index).koniec()) {
						tab[tablice].remove(index);
					}
				}
			}
			//sprawdz czy juz koniec
			koniec=czysto();
			
			
			
		}
	}
	private void wstaw(Proces p) {
		int nr=p.getNr();
		boolean wstawione=false;
		for(int x=0;x<tab.length;x++) {
			if(tab[nr].size()<prog) {
				wstawDoProcesora(nr,p);
				wstawione=true;
				break;
			}
		}
		if(wstawione==false) {
			wstawDoProcesora(p.getNr(),p);
		}
		
	}
	private void wstawDoProcesora(int numerprocka,Proces pr) {
		int obciazenie=pr.obciazenie();
		for(int x=0;x<obciazenie;x++) {
			tab[numerprocka].add(pr);
		}
	}
	private boolean czysto() {
		boolean koniec=true;
		for(int tablice=0;tablice<tab.length;tablice++) {
			if(tab[tablice].size()>0) {
				koniec=false;
			}
		}
	return koniec;
	}
	public void wyniki() {
		System.out.println("Strategia NR1");
		
	}
}
