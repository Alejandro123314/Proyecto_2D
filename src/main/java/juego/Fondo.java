package juego;

import javafx.scene.canvas.GraphicsContext;

public class Fondo extends ObjetoJuego {

	public Fondo(int x, int y, String nombreImagen, int velocidad) {
		super(x, y, nombreImagen, velocidad);
		
	}

	@Override
	public void pintar(GraphicsContext graficos) {
		graficos.drawImage(Juego.imagenes.get(nombreImagen), x, y);
		
	}

	@Override
	public void mover() {
		/*movimiento de fondo queda para implementar con personaje en la clase Jugador*/
		
	}

}
