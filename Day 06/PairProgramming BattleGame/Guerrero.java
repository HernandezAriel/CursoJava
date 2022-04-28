package dia6_PairProgrammin_Ejercicio2;

public class Guerrero extends Personaje implements Atacable{

	public Guerrero(String nombre, int ataque, int vida) {
		super(nombre, ataque,vida);
	}

	@Override
	public void atacar(Atacable enemigo) {
		enemigo.restarVida(getAtaque());
	}

	@Override
	public void restarVida(int ataque) {
		setVida(getVida()-ataque/2);	
	}
	
	
	
}
