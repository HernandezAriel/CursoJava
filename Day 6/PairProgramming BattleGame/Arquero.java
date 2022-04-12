package dia6_PairProgrammin_Ejercicio2;

public class Arquero extends Personaje implements Atacable {
	
	public Arquero(String nombre, int ataque, int vida) {
		super(nombre, ataque,vida);
	}

	@Override
	public void atacar(Atacable enemigo) {
		enemigo.restarVida((int)(getAtaque()*1.15));
	}

	@Override
	public void restarVida(int ataque) {
		setVida(getVida()-ataque);	
	}
	
}
