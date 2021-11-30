import javafx.application.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Koro extends Application {
	public void start(Stage primaryStage) throws Exception{
		primaryStage.setTitle("Koro Sensei - Assassination Classroom");
		Group root = new Group();
		Scene scene = new Scene(root, 400, 300);
		
		Circle face = new Circle(200,150,110);
		face.setFill(Color.YELLOW);
		face.setStroke(Color.BLACK);
		
		Circle left = new Circle(150, 120, 3);
		left.setFill(Color.WHITE);
		left.setStroke(Color.BLACK);
		
		Circle right = new Circle(250, 120, 3);
		right.setFill(Color.WHITE);
		right.setStroke(Color.BLACK);
		
		Arc up = new Arc();
		up.setFill(Color.YELLOW);
		up.setStroke(Color.BLACK);
		up.setCenterX(200);
		up.setCenterY(165);
		up.setRadiusX(70);
		up.setRadiusY(40);
		up.setStartAngle(180);
		up.setLength(180);
		up.setType(ArcType.OPEN);
		
		Arc down = new Arc();
		down.setFill(Color.WHITE);
		up.setStroke(Color.BLACK);
		down.setStroke(Color.BLACK);
		down.setCenterX(200);
		down.setCenterY(165);
		down.setRadiusX(70);
		down.setRadiusY(70);
	    down.setStartAngle(180);
		down.setLength(180);
		down.setType(ArcType.OPEN);
		
		Line line = new Line();
		line.setStartX(150);
		line.setStartY(193);
		line.setEndX(150);
		line.setEndY(213);
		
		Line line1 = new Line();
		line1.setStartX(180);
		line1.setStartY(203);
		line1.setEndX(180);
		line1.setEndY(231);
		
		Line line2 = new Line();
		line2.setStartX(210);
		line2.setStartY(204);
		line2.setEndX(210);
		line2.setEndY(233);
		
		Line line3 = new Line();
		line3.setStartX(240);
		line3.setStartY(198);
		line3.setEndX(240);
		line3.setEndY(221);
		
		root.getChildren().addAll(face, left, right, down,  up, line, line1, line2, line3);
		scene.setFill(Color.GRAY);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}