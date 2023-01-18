package juego;



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Juego extends Application {
	
	private GraphicsContext graficos;
	private Group root;
	private Scene scene;
	private Canvas lienzo; 
	
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
		

	}
	
	public void cicloJuego() {
		
	}
	
	public void actualizarEstado() {
		
	}
	

	public void inicializarComponentes() {
		root = new Group();
		scene = new Scene(root, 800, 600);
		lienzo = new Canvas(1000,1000);
		root.getChildren().add(lienzo);
		graficos = lienzo.getGraphicsContext2D();
	}
	
	public void pintar() {
		graficos.drawImage(new Image("images/BosqueVerde.png"),0,0);
		
	}
	
	private void gestionEventos() {
		
	}

}
