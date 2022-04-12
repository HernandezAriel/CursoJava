package dia6_PairProgrammin_Ejercicio2;

import java.util.ArrayList;

public class CampoDeBatalla {
	private static CampoDeBatalla instance;
	private String nombre;
	private ArrayList<Atacable> equipo1;
	private ArrayList<Atacable> equipo2; 
	
	private CampoDeBatalla() {
		this.equipo1 =  new ArrayList<Atacable>();
		this.equipo2 = new ArrayList<Atacable>();
	}
	
	public static CampoDeBatalla getInstance() {
		if(instance==null) {
			instance = new CampoDeBatalla();
		} 
		return instance;
	}
	
	
	public void agregaPersonajeEquipo1(Atacable personaje) {
		this.equipo1.add(personaje);
	}
	
	public void agregaPersonajeEquipo2(Atacable personaje) {
		this.equipo2.add(personaje);
	}
	

	
	public void pelea() {
		Atacable personaje1 =  this.equipo1.remove(0);
		Atacable personaje2 = this.equipo2.remove(0);
		int turno;
		
		while(((Personaje) personaje1).isVivo() && ((Personaje) personaje2).isVivo()) {
			turno = (int) (Math.random()*10);
			if(turno%2 == 0) {
				personaje1.atacar(personaje2);
				if(personaje2.getVida()!=0) {
					personaje2.atacar(personaje1);
				}
			} else {
				personaje2.atacar(personaje1);
				if(personaje1.getVida()!=0) {
					personaje1.atacar(personaje2);
				}
			}
		}
			if(((Personaje) personaje1).isVivo()) {
				equipo1.add(personaje1);
			} else {
				equipo2.add(personaje2);
			}
		}

	
	public int ganador() {
		//devuelve 1 si gano el equipo 1, 2 si gano el equipo 2 o 0 si todavia no gano nadie
		if(this.equipo1.isEmpty()){
			return 2;
		} else if(this.equipo2.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
		
	}
	
	
}
