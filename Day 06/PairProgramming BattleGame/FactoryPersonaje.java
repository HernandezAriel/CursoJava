package dia6_PairProgrammin_Ejercicio2;

public class FactoryPersonaje {
	public FactoryPersonaje() {
		
	}
	
	public Atacable crearPersonaje(int tipo,String nombre,int ataque,int vida) {
		// tipo: 1=Arquero, 2= Guerrero
		if(tipo==1) {
			return new Arquero(nombre,ataque,vida);
		} else {
			return new Guerrero(nombre,ataque,vida);
		}
				
			
	}
	
}
