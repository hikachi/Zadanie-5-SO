
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int procki=10;
		int prog=80;
		
		GenerowanieProcesow gp=new GenerowanieProcesow(2000,procki);
		gp.run();
		
		StrategiaNr1 nr1=new StrategiaNr1(gp.lista(),procki,prog);
		nr1.run();
	}

}
