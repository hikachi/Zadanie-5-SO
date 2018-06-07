import java.util.*;
public class GenerowanieProcesow {

	private int ilosc;
	private int iloscPR;
	ArrayList<Proces>lista=new ArrayList();
	Random r=new Random();
	public GenerowanieProcesow(int x,int pr) {
		this.ilosc=x;
		this.iloscPR=pr;
	}

	
	public ArrayList<Proces> lista(){
		return lista;
		}
	
	public void run() {
		for(int x=0;x<ilosc;x++) {
			int nrProcka=r.nextInt(iloscPR);
			int obcio=r.nextInt(9)+1;
			int czas=r.nextInt(30)+1;
			Proces pr=new Proces(nrProcka,obcio,czas);
			lista.add(pr);
		}
	}
}
