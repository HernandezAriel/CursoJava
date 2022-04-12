package dia6_PairProgrammin_Ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryPersonaje fp = new FactoryPersonaje();
		CampoDeBatalla cdb = CampoDeBatalla.getInstance();
		
		cdb.agregaPersonajeEquipo1(fp.crearPersonaje(2,"Leonidas",150,85));
		cdb.agregaPersonajeEquipo2(fp.crearPersonaje(1,"Arquerito",150,100));
		
		cdb.pelea();
		
		if(cdb.ganador()==1) {
			System.out.println("Gano el equipo 1");
		} else if(cdb.ganador()==2) {
			System.out.println("Gano el equipo 2");
		}
		
	}

}
