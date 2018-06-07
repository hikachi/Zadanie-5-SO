
public class Proces {
	
	private int obciazenie;
	private int czas;
	private int numerProcesora;
	
	
	public Proces(int nr,int ob,int cz) {
		this.obciazenie=ob;
		this.czas=cz;
		this.numerProcesora=nr;
	}
	public Proces(Proces pr) {
		this.obciazenie=pr.obciazenie;
		this.czas=pr.czas;
	}
	public void czas() {
		this.czas=czas-1;
	}
	public int czass() {
		return this.czas;
	}
	public int getNr() {
		return this.numerProcesora;
	}
	public int obciazenie() {
		return this.obciazenie;
	}
	public boolean koniec() {
		boolean result=false;
		if(this.czas==0) {
			result=true;
		}
		return result;
	}
}
