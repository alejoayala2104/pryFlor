package proyectoFiguras;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AppFiguras extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
						
		//Scene scene = this.figurasStackPane();
		//Scene scene = this.banderaColombia();
		Scene scene = this.flor();
		//Darle un titulo a la ventana
		primaryStage.setTitle("Figuras Geometricas");
		//Colocar la escena en el Stage o ventana
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	private Scene flor() {
		
		int factor = 10;
		
		double vertices_centro[] = {9.3 * factor, 9.3 * factor,
									10.0 * factor, 12.7 * factor,
									13.0 * factor, 12.0 * factor,
									12.2 * factor, 8.6 * factor
									};
		Polygon centro = new Polygon(vertices_centro);
		centro.setFill(Color.BROWN);
		
		Circle cir_arriba = new Circle(10 * factor, 4.6 * factor, 4 * factor);
		cir_arriba.setFill(Color.YELLOW);		
		Circle cir_izq = new Circle(5.5 * factor, 11.5 * factor, 4 * factor);
		cir_izq.setFill(Color.YELLOW);
		Circle cir_der = new Circle(16.8 * factor, 9.5 * factor, 4 * factor);
		cir_der.setFill(Color.YELLOW);
		Circle cir_abajo = new Circle(12.2 * factor, 16.5 * factor, 4 * factor);
		cir_abajo.setFill(Color.YELLOW);
		
		Rectangle tallo = new Rectangle(11 * factor, 20 * factor, 1 * factor, 7 * factor);
		tallo.setFill(Color.YELLOWGREEN);
		
		double vertices_hoja_izq[] = {5.2 * factor, 19.5 * factor,
									  7.0 * factor, 24.5 * factor,
									  11.0 * factor, 22.3 * factor};		
		Polygon hoja_izq = new Polygon(vertices_hoja_izq);
		hoja_izq.setFill(Color.GREEN);
		
		double vertices_hoja_der[] = {18 * factor, 21.5 * factor,
									  16.5 * factor, 26 * factor,
									  12.0 * factor, 23.8 * factor};
		Polygon hoja_der = new Polygon(vertices_hoja_der);
		hoja_der.setFill(Color.GREEN);
		
		Rectangle maceta_sup = new Rectangle(5.5 * factor, 27 * factor, 12 * factor, 3 * factor);
		maceta_sup.setFill(Color.SLATEGREY);
		Rectangle maceta_inf = new Rectangle(7.0 * factor, 30 * factor, 9 * factor, 9 * factor);
		maceta_inf.setFill(Color.DARKGREY);
		
		Pane root = new Pane();
		root.getChildren().addAll(centro, cir_arriba, cir_izq, cir_der, cir_abajo,
				tallo, hoja_izq, hoja_der, maceta_sup, maceta_inf);
		Scene scene = new Scene(root,400,600);
		return scene;
	}
	
	private Scene pollito() {
		//PARA HACERLO MAS GRANDE SE MULTIPLICA TODO POR UN FACTOR
		int factor = 10;
		
		
		Circle cabeza = new Circle(26.5 * factor, 7.5 * factor, 6.5 * factor);
		//Poner el circulo transparente
		cabeza.setFill(Color.TRANSPARENT);
		//Cambiar el color del contorno a rojo
		cabeza.setStroke(Color.RED);
		//Cambiar de tamano el contorno
		cabeza.setStrokeWidth(2);		
		Circle cuerpo = new Circle(14.5 * factor, 15.5 * factor, 9.5 * factor);
		cuerpo.setFill(Color.RED);
		Polygon pico = new Polygon();
		pico.getPoints().addAll(new Double[] {
						32.2 * factor, 3.8 * factor, 
						40.5 * factor, 4.0 * factor,
						33.0 * factor, 6.5 * factor
						});
		
		pico.setFill(Color.RED);
		
		Polygon cola = new Polygon();
		cola.getPoints().addAll(new Double[] {				
						0.0 * factor, 9.5 * factor,
						7.0 * factor, 11.0 * factor,
						4.8 * factor, 14.5 * factor
						});
		
		pico.setFill(Color.RED);
		
		double vertices_pata_izq[] = {	7.5 * factor, 28.0 * factor,
										10.5 * factor, 23.5 * factor,
										13.0 * factor, 28.0 * factor};
		
		Polygon pata_izq = new Polygon(vertices_pata_izq);
		
		double vertices_pata_der[] = {	14.5 * factor, 28.0 * factor,
										17.0 * factor, 23.5 * factor,
										19.5 * factor, 28.0 * factor};

		Polygon pata_der = new Polygon(vertices_pata_der);		
		
		Pane root = new Pane();
		root.getChildren().addAll(cabeza,cuerpo,pico,cola,pata_izq,pata_der);
		
		Scene scene = new Scene(root,400,300);
		return scene;
		
	}
	
	private Scene figurasStackPane() {
		
		Circle figCir = new Circle(80);//Radio 80 pixeles
		//Poner un color al circulo. Tambien se lo puede poner
		//en el constructor
		figCir.setFill(Color.GREENYELLOW);//Color de relleno al circulo
		
		Rectangle figRec = new Rectangle(200,40);//Ancho, Alto
		//Tengo 2 elementos que quiero mostrar
		//Panel: Mejor manera para mostrar elementos		
		
		
		StackPane root = new StackPane();//Centra los elementos
		//Stack: Apilar. Uno encima del otro
		/*
		 * Root Node: Contenedor (Azules de las diapositiva)
		 * Root Node siempre va a ser de tipo Pane, porque 
		 * ahi voy a agregar elementos, que serian "hijos".
		 */
		
		//getChildren() permite obtener una lista de los hijos del nodo padre
		//y a esa lista le voy a agregar las figuras con add()
		root.getChildren().add(figCir);
		root.getChildren().add(figRec);
		
		Scene scene = new Scene(root,250,200);
		
		return scene;		
	}
	
	private Scene figurasPane() {
		Circle figCir = new Circle(200,100,50);	// x, y, radio
		Rectangle figRec = new Rectangle(80, 10, 240, 40); //x , y , ancho, alto
		
		Pane root = new Pane();
		root.getChildren().add(figCir);
		root.getChildren().add(figRec);
		//Otra opcion para usar XY es Group
		
		Scene scene = new Scene(root,400,200);
		return scene;		
	}
	
	private Scene banderaColombia() {
		
		Rectangle amarillo = new Rectangle(0,0,500,200);
		amarillo.setFill(Color.YELLOW);
		Rectangle azul = new Rectangle(0,200,500,100);
		azul.setFill(Color.BLUE);
		Rectangle rojo = new Rectangle(0,300,500,100);
		rojo.setFill(Color.RED);
		
		Rectangle soporte = new Rectangle(500,0,15,600);		
		Rectangle base1 = new Rectangle(483,600,50,20);
		Rectangle base2 = new Rectangle(463,620,90,20);
		Rectangle base3 = new Rectangle(443,640,130,20);
		
		Text texto = this.textoBanderaColombia();	
		Text t2 = new Text("Alejandro Ayala");
		t2.setY(460);
		
		Pane root = new Pane();		
		root.getChildren().addAll(amarillo,azul,rojo,soporte,base1,base2,base3,texto,t2);
		
		Scene scene = new Scene(root,700,800);
		return scene;
	}
	
	private Text textoBanderaColombia() {
		InnerShadow is = new InnerShadow();
		is.setOffsetX(4.0f);
		is.setOffsetY(4.0f);

		Text t = new Text();
		t.setEffect(is);
		t.setX(45);
		t.setY(440);
		t.setText("Bandera de Colombia");
		t.setFill(Color.BLUE);
		
		//metodo font("Tipo de fuente. Como Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, tamano de la fuente);
		t.setFont(Font.font("Bad Script", FontWeight.BOLD, 40));
		 
		return t;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}

}
