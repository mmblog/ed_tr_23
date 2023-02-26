package pac4_1;

public class main {

	public static void main(String[] args) {
		//JOSE MANUEL FUENTES///////////////////////////
		JMFuentes P1 = new JMFuentes("","",0);
		System.out.println(P1);
		
		System.out.printf("¡Cumpleaños!");
		P1.cumpleanyo();
		System.out.printf("%s",P1);
		
		System.out.printf("\nBorrando datos...");
		P1.borrarDatos();
		System.out.printf("%s",P1);
		
		//ENRIQUE MERCHANTE/////////////////////////////
		Emerchante P2 = new Emerchante("","",0);
		System.out.printf("\n%s",P2);
		
		System.out.printf("\n¡Cumpleaños!");
		P2.cumpleanyo();
		System.out.printf("%s",P2);
		
		System.out.printf("\nBorrando datos...");
		P2.borrarDatos();
		System.out.printf("%s",P2);
		
		
		//CHRISTIAN GUERRERO///////////////////////////
		CGuerrero P3 = new CGuerrero("","",0);
		System.out.printf("\n%s",P3);
				
		System.out.printf("\n¡Cumpleaños!");
		P3.cumpleanyo();
		System.out.printf("%s",P3);
				
		System.out.printf("\nBorrando datos...");
		P3.borrarDatos();
		System.out.printf("%s",P3);
	}

}
