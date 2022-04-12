package dia6_PairProgrammin_Ejercicio2;

public class Personaje  {
	private String nombre;
	private int ataque;
	private int vida;
	private boolean vivo;
	
	public Personaje(String nombre, int ataque, int vida) {
		this.nombre = nombre;
		this.ataque = ataque;
		this.vida = vida;
		this.vivo=true;
	}

	public int getAtaque() {
		return ataque;
	}
	
	public void setVida(int vida) {
		if(vida<=0) {
			this.vida=0;
			this.vivo=false;
		} else {
			this.vida = vida;
		}
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public boolean isVivo() {
		return vivo;
	}
	
	
	
	
	
}
