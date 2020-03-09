package net.instituto.desa;

public class Jugador {
	int y, x;
    
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void MovimientoDerecha() {
		setX(getX() + 1);
		
	}
	public void MovimientoIzq() {
		this.setX(this.getX() + 1);
		
	}
	public void MovimientoArr() {
		this.setX(this.getX() + 1);
		
	}
	public void MovimientoAbajo() {
		this.setX(this.getX() + 1);
		
	}

}
