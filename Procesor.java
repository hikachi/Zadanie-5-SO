import java.util.*;
public class Procesor {

	ArrayList<Proces>lista=new ArrayList();
	
	
	public void add(Proces p) {
		lista.add(p);
	}
	public int size() {
		return lista.size();
	}
	public Proces get(int nr) {
		return lista.get(nr);
	}
	public void remove(int x) {
		lista.remove(0);
	}
	public ArrayList<Proces>list() {
		return lista;
	}
}
