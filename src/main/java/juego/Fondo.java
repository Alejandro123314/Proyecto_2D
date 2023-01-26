package juego;

import javafx.scene.canvas.GraphicsContext;

public class Fondo extends ObjetoJuego {
	
	private String nombreImagen2;
	private int x2;
	public Fondo(int x, int y, String nombreImagen, String nombreImagen2, int velocidad) {
		super(x, y, nombreImagen, velocidad);
		this.nombreImagen2 = nombreImagen2;
		ancho = (int) Juego.imagenes.get("BosqueVerde").getWidth();
		alto = (int) Juego.imagenes.get("BosqueVerde").getHeight();
		x2 = ancho+this.x;
	}


	@Override
	public void pintar(GraphicsContext graficos) {
		graficos.drawImage(Juego.imagenes.get(nombreImagen), x, y);
		graficos.drawImage(Juego.imagenes.get(nombreImagen2), x2, y);
	}

	@Override
	public void mover() {
		
		if (x <= -1*ancho) {
			x = ancho;
			System.out.println("hola1");
		}
		
		if(x2 <= -1*ancho) {
			x2 = ancho;
			System.out.println("hola2");
		}
		
		if(Juego.derecha)
			x-=velocidad;
			x2-=velocidad;
		
		if(Juego.izquierda)
			x+=velocidad;
			x2+=velocidad;
		
	}
//192.168.1.165 puerto:50.555
}
