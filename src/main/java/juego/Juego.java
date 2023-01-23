package juego;

import java.util.HashMap;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Juego extends Application {

	private GraphicsContext graficos;
	private Group root;
	private Scene scene;
	private Canvas lienzo;
	private Fondo fondo;
	private Jugador jugador;
	public static boolean arriba;
	public static boolean abajo;
	public static boolean derecha;
	public static boolean izquierda;
	public static HashMap<String, Image> imagenes;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		inicializarComponentes();
		gestionEventos();
		cicloJuego();
		pintar();
		primaryStage.setScene(scene);
		primaryStage.setTitle("Monkey Brosh");
		primaryStage.show();
	}

	public void cargarImagenes() {
		imagenes.put("BosqueVerde", new Image("images/BosqueVerde.png"));
		imagenes.put("Personaje", new Image("images/ReaperChiquito.jpg"));

	}

	public void cicloJuego() {

	}

	public void actualizarEstado() {
		fondo.mover();
	}

	public void inicializarComponentes() {
		imagenes = new HashMap<String, Image>();
		cargarImagenes();
		fondo = new Fondo(0, 0, "BosqueVerde", 0);
		jugador = new Jugador(0, 0, "Personaje", 0);
		root = new Group();
		scene = new Scene(root, 800, 600);
		lienzo = new Canvas(1000, 1000);
		root.getChildren().add(lienzo);
		graficos = lienzo.getGraphicsContext2D();
	}

	public void pintar() {
		fondo.pintar(graficos);
		jugador.pintar(graficos);

	}

	private void gestionEventos() {
		/* implementar para pruebas con el mapa */

		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent evento) {
				switch (evento.getCode().toString()) {
				case "RIGHT":
					derecha = true;
					break;
				case "LEFT":
					izquierda = true;
					break;
				case "UP":
					arriba = true;
					break;
				case "DOWN":
					abajo = true;
				}
			}
		});

		scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent evento) {
				switch (evento.getCode().toString()) {
				case "RIGHT":
					derecha = false;
					break;
				case "LEFT":
					izquierda = false;
					break;
				case "UP":
					arriba = false;
					break;
				case "DOWN":
					abajo = false;
				}
			}
		});

	}
}
